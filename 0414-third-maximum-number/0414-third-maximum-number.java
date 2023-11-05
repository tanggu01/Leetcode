class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i]) == true) {
                arr.add(nums[i]);
            }
        }
        Collections.sort(arr, Collections.reverseOrder());
        if (arr.size() < 3) return arr.get(0);
        return arr.get(2);
    }
}