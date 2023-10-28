class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int p1 = 0;
        int p2 = 0;

        while (p2 < n && p1 < n) { 
            if (nums[p1] == 0) {
                while (p2 < n-1 && nums[p2] == 0) {
                    p2++;
                }
                nums[p1] = nums[p2];
                nums[p2] = 0;
                p1++;
                p2++;
            } else {
                p1++;
                p2++;
            }
        }
    }
}