//solution 1
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; //keep track of current element
        int lastIdx = nums.length; //keep track of last element
        while (i < lastIdx) {
            if (nums[i] == val) { 
                nums[i] = nums[lastIdx-1]; //replace curr element with last element,
                lastIdx--; //remove the replaced last element
                //do not increment in case that last element is also equals to val; check replaced nums[i] once again
            } else {
                i++; //increment current element if the element != val
            }
        }
        return lastIdx;
    }
}


//solution 2
/**
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
*/