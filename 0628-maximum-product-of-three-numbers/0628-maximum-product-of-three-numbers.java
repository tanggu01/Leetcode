class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length - 1;
        int maxPos = nums[i] * nums[i-1] * nums[i-2];;
        int maxNeg = nums[0] * nums[1] * nums[i]; 
        return (maxPos > maxNeg) ? maxPos : maxNeg;
    }
}