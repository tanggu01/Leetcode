class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) 
            return mat;
        
        int[][] newMat = new int[r][c];
        ArrayList<Integer> list = new ArrayList<>();
        int k = 0;
        for (int[] row : mat) {
            for (int num: row) {
                list.add(num);
            }
        }
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newMat[i][j] = list.get(k++);
            }
        }
        return newMat;
    }
}