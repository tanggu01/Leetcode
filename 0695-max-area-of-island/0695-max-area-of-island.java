class Solution {
    int maxSum = 0;
    int sum = 0;
    public int maxAreaOfIsland(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    sum = 0; //initialize sum for each island
                    dfs(grid, i, j);
                    maxSum = Math.max(sum,maxSum);
                }
            }
        }
        return maxSum;
    }

    public void dfs(int[][] grid, int r, int c) {
        int row = grid.length;
        int col = grid[0].length;
        if (r < 0 || r >= row || c < 0 || c >= col || grid[r][c] == 0) {
            return;
        }
        //Mark the current cell as visited (0) to avoid revisiting it
        grid[r][c] = 0;
        sum++;
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
    }
}

/*
class Solution {
    int maxSum = 0;
    int sum = 0;
    public int maxAreaOfIsland(int[][] grid) {
        //int sum = 0; //not here
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    sum = 0; //initialize sum for each island
                    dfs(grid, i, j, visited); //sum = dfs(grid, i, j, sum);
                    maxSum = Math.max(sum,maxSum);
                }
            }
        }
        return maxSum;
    }

    public void dfs(int[][] grid, int r, int c, boolean[][] visited) {
        int row = grid.length;
        int col = grid[0].length;
        if (r < 0 || r >= row || c < 0 || c >= col || grid[r][c] == 0 || visited[r][c] == true) {
            return;
        }
        // } else if (grid[r][c] == 1) { //curr cell is already 1
        //     sum+=1; 
        // }

        // Mark the current cell as visited (0) to avoid revisiting it
        //grid[r][c] = 0;
        visited[r][c] = true;
        sum++;

        dfs(grid, r, c+1, visited);
        dfs(grid, r, c-1, visited);
        dfs(grid, r+1, c, visited);
        dfs(grid, r-1, c, visited);

        // return sum;
    }
}
*/