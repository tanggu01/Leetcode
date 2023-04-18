class Solution { //1. '.'으로 비교 ; 2. set은 put아니고 add임
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) { 
            Set<Character> colSet = new HashSet<>();
            Set<Character> rowSet = new HashSet<>();
            Set<Character> subSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !colSet.add(board[i][j])) //col 
                return false;
                if (board[j][i] != '.' && !rowSet.add(board[j][i])) //row 
                return false;
                int rowIndex = 3 * (i/3); //0,0,0 3,3,3, 6,6,6
                int colIndex = 3 * (i%3); //0,3,6 0,3,6 0,3,6
                if (board[rowIndex+j/3][colIndex+j%3] != '.' && !subSet.add(board[rowIndex + j/3][colIndex + j%3])) 
                    return false;
            }
        }
        return true;
    }
}