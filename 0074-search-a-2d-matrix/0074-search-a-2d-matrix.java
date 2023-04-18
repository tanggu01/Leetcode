class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m*n -1;
        while (start <= end) { // <= not < 
            int index = start + (end-start)/2;  // <- rather than (start+end)/2
            if (matrix[index/n][index%n] == target) { 
                return true;
            } else if (matrix[index/n][index%n] > target) {
                end = index - 1; // -1 해주기!
            } else {
                start = index + 1 ; // +1 해주기!
            }
        }
        return false;
    }
}