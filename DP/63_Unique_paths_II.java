class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        return memo(obstacleGrid, 0, 0, dp);
        // return recur(obstacleGrid, 0, 0);
    }

    public int memo(int[][] arr, int i, int j, int[][] dp) {
        if(i >= arr.length || j >= arr[0].length) {
            return 0;
        }

        if(arr[i][j] != 0) {
            return 0;
        }

        if(i == arr.length - 1 && j == arr[0].length - 1) {
            return 1;
        }

        if(dp[i][j] != 0) {
            return dp[i][j];
        }

        dp[i][j] = memo(arr, i+1, j, dp) + memo(arr, i, j+1, dp);

        return dp[i][j];
    }

    // public int recur(int[][] arr, int i, int j) {
    //     if(i >= arr.length || j >= arr[0].length) {
    //         return 0;
    //     }

    //     if(arr[i][j] != 0) {
    //         return 0;
    //     }

    //     if(i == arr.length - 1 && j == arr[0].length - 1) {
    //         return 1;
    //     }

    //     int ans = recur(arr, i+1, j) + recur(arr, i, j+1);

    //     return ans;
    // }
}