class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length; 
        int i = 0;
        int j = 0;
        int totalCount = 0;
        while (j < n-1) { 
            if (nums[j] == nums[j+1]) {
                int count = 0;
                while ( j < n-1 && nums[j] == nums[j+1]) {
                    j++;
                    count++;
                } 
                totalCount += count;
            } else {
                nums[i+1] = nums[j+1]; // Move the unique element to the correct position
                i++; //Move the pointers i and j
                j++;
            }
        }
        return n - totalCount;
    }
}