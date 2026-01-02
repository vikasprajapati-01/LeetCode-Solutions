class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;

        int ans = 0;
        for(int i = 0; i<n; i++) {
            int prod = nums[i];
            int gcd = nums[i];
            int lcm = nums[i];

            for(int j = i+1; j<n; j++) {
                prod *= nums[j];
                gcd = findGCD(gcd, nums[j]);
                lcm = findLCM(lcm, nums[j]);

                if(prod == (gcd * lcm)) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

    public int findGCD(int m, int n) {
        if(n == 0) {
            return m;
        }
        return findGCD(n, m%n);
    }

    public int findLCM(int m, int n) {
        return (m * n) / findGCD(m,n);
    }
}