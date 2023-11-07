class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int currMax = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] < nums[i]) {
                currMax++;
                max = Math.max(currMax, max);
            } else {
                currMax = 1;
            }
        }
        return max;
    }
}