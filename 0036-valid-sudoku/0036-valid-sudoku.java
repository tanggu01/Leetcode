class Solution { //2ms
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) { //col 
            Set<Character> colSet = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.' && !colSet.add(board[i][j])) 
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) { //row 
            Set<Character> rowSet = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[j][i] != '.' && !rowSet.add(board[j][i])) 
                return false;
            }
        }

        for (int i = 0 ; i < board.length; i++) { //박스 하나 * 9번
            Set<Character> subSet = new HashSet<>();
            for (int j = 0; j < 9; j++ ) {//박스 안 9번 
                int rowIndex = 3 * (i/3); //0,0,0 3,3,3 6,6,6
                int colIndex = 3 * (i%3); //0,3,6 0,3,6 0,3,6
                if (board[rowIndex+j/3][colIndex+j%3] != '.' && !subSet.add(board[rowIndex + j/3][colIndex + j%3])) 
                    return false;
            }
        }
        return true;
    }
}

/* 3ms
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
*/