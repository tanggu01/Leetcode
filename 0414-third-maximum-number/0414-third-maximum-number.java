class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) { //make descending order
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        
        int res = nums[0];
        int count = 1; //[3,2,2,1] [3,3,3,2]
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) continue;
            if (nums[i-1] != nums[i]) {
               res = nums[i];
               count++;
            }
            if (count == 3) return res;
        }
        if (count < 3) return nums[0];
        return res;
    }
}