class Solution {
    public boolean isMonotonic(int[] nums) {
        //min, max 구해서 하면 asc, desc 모름 -> loop 으로 찾기
        int diff = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i-1] != 0) {
                diff = nums[i] - nums[i-1];
                break;
            }
        }

        if (diff == 0) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] - nums[i-1] != 0) return false;
            }            
        }
        else if (diff < 0) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] - nums[i-1] > 0) return false;
            }
        } else if (diff > 0) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] - nums[i-1] < 0) return false;
            }
        }
        return true;
    }
}