class Solution {
    /*public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (map.get(i) + map.get(j) == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }*/
    
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) { //map에 새로운 값 put 할때마다 체크
        if (map.containsKey(target - nums[i])) {
            result[0] = i;
            result[1] = map.get(target-nums[i]);
            return result;
        }
        map.put(nums[i], i);
    }   
    return result;
    }
}