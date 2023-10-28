class Solution { //1ms, 55.58mb
    public boolean isMonotonic(int[] nums) {
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

/* 2ms, 55.5mb
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 1; i < nums.length; i++) {
            if (!inc && !dec) {
                return false;
            } else if (nums[i] > nums[i-1]) {
                dec = false;
            } else if (nums[i] < nums[i-1]) {
                inc = false;
            } 
        }
        return inc || dec;
    }
}
*/