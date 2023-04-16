class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        /* O(n2)
        int row = mat.length;
        int col = mat[0].length;
        if (row * col != r * c) 
            return mat;
        int[][] newMat = new int[r][c];
        int newRow = 0, newCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newMat[newRow][newCol] = mat[i][j];
                newCol++;
                if (newCol == c) {
                    newRow++;
                    newCol = 0;
                }
            }
        }
        return newMat;
    } */


    //O(n)
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int[][] newMat = new int[r][c];
        int row = mat.length;
        int col = mat[0].length; 
        for (int i = 0; i < row * col; i++) {
            newMat[i/c][i%c] = mat[i/col][i%col];
        }
        return newMat;
    }
}