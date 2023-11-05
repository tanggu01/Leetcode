class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[]{i,j});
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] val = queue.poll();
            int x = val[0];
            int y = val[1];
            for (int k = 0; k < n; k++) {
                matrix[k][y] = 0;
            }
            for (int l = 0; l < m; l++) {
                matrix[x][l] = 0;
            }
        }
    }
}