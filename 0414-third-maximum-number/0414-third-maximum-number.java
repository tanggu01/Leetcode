class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int res = nums[nums.length - 1];
        int count = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i-1] != nums[i]) { 
               res = nums[i-1];
               count++;
            }
            if (count == 3) return res;
        }
        if (count < 3) return nums[nums.length - 1];
        return res;
    }
}