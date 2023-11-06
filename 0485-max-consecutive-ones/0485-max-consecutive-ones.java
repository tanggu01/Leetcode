class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0;
        int currMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currMax++;
            } else {
                maxLen = Math.max(currMax, maxLen);
                currMax = 0;
            }
        }
        return Math.max(currMax, maxLen);
    }
}