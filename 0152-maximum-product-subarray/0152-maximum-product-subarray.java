class Solution {
    public int maxProduct(int[] nums) {
        int resMax = nums[0], max = nums[0], min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(max * nums[i], nums[i]);
            min = Math.min(min * nums[i], nums[i]);
            resMax = Math.max(resMax, max);
        }
        return resMax;
    }
}