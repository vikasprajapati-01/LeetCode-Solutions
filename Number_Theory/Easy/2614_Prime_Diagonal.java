class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;

        int ans = 0;
        for(int i = 0; i<n; i++) {
            ans = Math.max(ans, getPrime(nums[i][i]));
            ans = Math.max(ans, getPrime(nums[i][n-i-1]));

            // if(isPrime(nums[i][i]) && ans < nums[i][i]) {
            //     ans = nums[i][i];
            // }
            // if(isPrime(nums[i][n-i-1]) && ans < nums[i][n-i-1]) {
            //     ans = nums[i][n-i-1];
            // }
        }
        return ans;
    }

    public int getPrime(int n) {
        if(n <= 1) {
            return 0;
        }
        else if(n == 2 || n == 3) {
            return n;
        }
        else if(n % 2 == 0 || n % 3 == 0) {
            return 0;
        }

        for(int i = 5; i*i <= n; i++) {
            if(n % i == 0) {
                return 0;
            }
        }
        return n;
    }

    // public boolean isPrime(int n) {
    //     if(n <= 1) {
    //         return false;
    //     }
    //     else if(n == 2 || n == 3) {
    //         return true;
    //     }
    //     else if(n % 2 == 0 || n % 3 == 0) {
    //         return false;
    //     }

    //     for(int i = 5; i*i <= n; i++) {
    //         if(n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}