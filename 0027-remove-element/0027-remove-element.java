class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; //keep track of index of element to copy value not equal to val
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) { //skip when nums[j] == val 
                nums[i] = nums[j]; // copy nums[j] (unique) to nums[i]
                i++; //move pointer to next element to replace
            } 
        }
        return i;
    }
}