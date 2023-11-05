class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count++;
               maj = nums[i];
            } 
            else if (maj == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return maj;
    }
}