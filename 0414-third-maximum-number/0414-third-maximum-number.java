class Solution {
    public int thirdMax(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.put(nums[i], map.getOrDefault(nums[i], 0) + 1) == null) {
                arr.add(nums[i]);
            }
        }
        Collections.sort(arr);
        if (arr.size() < 3) return arr.get(arr.size() - 1);
        return arr.get(arr.size() - 3);





    }
}