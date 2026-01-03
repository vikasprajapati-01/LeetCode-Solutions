class Solution {
    public int countPrimes(int n) {
        if(n <= 2) {
            return 0;
        }

        // ------ Using Sieve of Eratosthenes
        int ans = 0;
        boolean[] flag = new boolean[n];
        Arrays.fill(flag, true);
        flag[0] = flag[1] = false;

        for(int i = 2; i*i<n; i++) {
            if(flag[i]) {
                for(int j = i * i; j < n; j += i) {
                    flag[j] = false;
                }
            }
        }

        for(boolean each : flag) {
            if(each) {
                ans++;
            }
        }

        // for(int i = 2; i<n; i++) {
        //     if(flag[i]) {
        //         ans++;
        //     }
        // }

        return ans++;
    }
}