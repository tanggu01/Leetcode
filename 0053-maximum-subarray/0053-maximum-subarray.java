class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = nums[0];
        int bestMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(currMax + nums[i], nums[i]);
            bestMax = Math.max(currMax, bestMax);
        }
        return bestMax;
    }
}