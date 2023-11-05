class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int res = nums[nums.length - 1];
        int count = 1;
        for (int i = nums.length - 1; i > 0 && count < 3; i--) {
            if (nums[i-1] != nums[i]) { 
               res = nums[i-1];
               count++;
            }
        }
        return count == 3 ? res : nums[nums.length - 1];
    }
}