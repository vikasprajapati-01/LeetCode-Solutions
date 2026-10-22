class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for(int i = 0; i<9; i++) {
            for(int j = 0; j<9; j++) {
                if(board[i][j] == '.') {
                    for(char k = '1'; k<='9'; k++) {
                        if(valid(board, i, j, k)) {
                            board[i][j] = k;

                            if(solve(board)) {
                                return true;
                            }
                            else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean valid(char[][] board, int row, int col, char ch) {
        for(int i = 0; i<9; i++) {
            if(board[row][i] == ch) {
                return false;
            }
            
            if(board[i][col] == ch) {
                return false;
            }
        }

        row = (row / 3) * 3;
        col = (col / 3) * 3;
        for(int i = row; i<row+3; i++) {
            for(int j = col; j<col+3; j++) {
                if(board[i][j] == ch) {
                    return false;
                }
            }
        }

        return true;
    }
}