class Solution {
    public int countBeautifulPairs(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for(int i = 0; i<n; i++) {
            int first = findFirst(nums[i]);
            for(int j = i+1; j<n; j++) {
            // if(coprime(first,nums[j])) {
            if(gcd(first, nums[j] % 10) <= 1) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public int findFirst(int n) {
        while(n > 9) {
            n /= 10;
        }
        return n;
    }

    // public boolean coprime(int a, int b) {
    //     int last = b % 10;
    //     if(gcd(a, last) <= 1) {
    //         return true;
    //     }
    //     return false;
    // }

    public int gcd(int m, int n) {
        if(n == 0) {
            return m;
        }
        return gcd(n, m%n);
    }
}