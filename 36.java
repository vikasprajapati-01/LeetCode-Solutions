class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++) {
            for(int j = 0; j<9; j++) {
                char ch = board[i][j];

                if(ch != '.') {
                    for(int k = 0; k<9; k++) {
                        if(k != j && board[i][k] == ch) {
                            return false;
                        }
                    }

                    for(int k = 0; k<9; k++) {
                        if(k != i && board[k][j] == ch) {
                            return false;
                        }
                    }

                    int row = (i / 3) * 3;
                    int col = (j / 3) * 3;

                    for(int x = row; x < row + 3; x++) {
                        for(int y = col; y < col + 3; y++) {
                            if((x != i || y != j) && board[x][y] == ch) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}