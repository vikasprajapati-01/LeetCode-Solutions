class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];

        return memo(m, n, 1, 1, dp);
        // return recur(m, n, 1, 1);
    }

    public int memo(int m, int n, int i, int j, int[][] dp) {
        if(i > m || j > n) {
            return 0;
        }

        if(i == m || j == n) {
            return 1;
        }

        if(dp[i][j] != 0) {
            return dp[i][j];
        }

        dp[i][j] = memo(m, n, i+1, j, dp) + memo(m, n, i, j+1, dp);

        return dp[i][j];
    }

    // public int recur(int m, int n, int i, int j) {
    //     if(i == m && j == n) {
    //         return 1;
    //     }
    //     if(i == m) {
    //         return 1;
    //     }
    //     if(j == n) {
    //         return 1;
    //     }

    //     if(i > m || j > n) {
    //         return 0;
    //     }

    //     int ans = 0;
    //     ans += recur(m, n, i+1, j);
    //     ans += recur(m, n, i, j+1);

    //     return ans;
    // }
}