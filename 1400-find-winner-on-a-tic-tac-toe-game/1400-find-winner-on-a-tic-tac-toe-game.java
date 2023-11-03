class Solution {
    public String tictactoe(int[][] moves) {
        char[][] grid = new char[3][3];
        int turn = 0;
        for (int[] move : moves) {
            char player = (turn % 2 == 0) ? 'A' : 'B';
            grid[move[0]][move[1]] = player;
            turn++;
            if (checkCondition(grid)) return String.valueOf(player);
        }
        return (moves.length < 9) ? "Pending" : "Draw";
    }

    public boolean checkCondition(char[][] grid) {
        for (int i = 0; i < 3; i++) {
            if ((grid[0][i] == 'A' && grid[1][i] == 'A' && grid[2][i] == 'A') ||
                    (grid[0][i] == 'B' && grid[1][i] == 'B' && grid[2][i] == 'B')) {
                return true;
            }
            else if ((grid[i][0] == 'A' && grid[i][1] == 'A' && grid[i][2] == 'A') ||
                    (grid[i][0] == 'B' && grid[i][1] == 'B' && grid[i][2] == 'B')) {
                return true;
            }
            else if ((grid[0][0] == 'A' && grid[1][1] == 'A' && grid[2][2] == 'A') ||
                    (grid[0][0] == 'B' && grid[1][1] == 'B' && grid[2][2] == 'B') ||
                    (grid[0][2] == 'A' && grid[1][1] == 'A' && grid[2][0] == 'A') ||
                    (grid[0][2] == 'B' && grid[1][1] == 'B' && grid[2][0] == 'B')) {
                return true;
            }
        }
        return false;
    }
}