class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean[][] board = new boolean[n][n];

        return backtrack(board, 0, ans);
        // return backtrack(new boolean[n][n], 0, new ArrayList<List<String>>());
    }

    public List<List<String>> backtrack(boolean[][] board, int row, List<List<String>> ans) {
        if (row == board.length) {
            ans.add(makeBoard(board));
            return ans;
        }

        for(int col = 0; col<board.length; col++) {
            if(safe(board, row, col)) {
                board[row][col] = true;
                backtrack(board, row + 1, ans);
                board[row][col] = false;
            }
        }

        return ans;
    }

    public boolean safe(boolean[][] board, int row, int col) {
        for(int i = row - 1; i >= 0; i--) {
            if(board[i][col]) {
                return false;
            }
        }

        int left = Math.min(row, col);
        for(int i = 1; i<=left; i++) {
            if(board[row-i][col-i] == true) {
                return false;
            }
        }

        int right = Math.min(row, board.length - col - 1);
        for(int i = 1; i<=right; i++) {
            if(board[row-i][col+i] == true) {
                return false;
            }
        }
        return true;
    }

    public List<String> makeBoard(boolean[][] board) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();

            for (int j = 0; j < board.length; j++) {
                row.append(board[i][j] ? 'Q' : '.');
            }

            result.add(row.toString());
        }

        return result;
    }
}