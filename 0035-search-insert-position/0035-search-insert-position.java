class Solution {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        int pos = 0;

        while (high >= low) {
            pos = low + (high - low) / 2; 
            if (target == nums[pos]) return pos;
            else if (target < nums[pos]) {
                high = pos - 1; 
            }
            else if (target > nums[pos]) {
                low = pos + 1; 
            }
        }
        return low;
    }
}