class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return gcd(max,min);
    }

    public int gcd(int m, int n) {
        if(n==0) {
            return m;
        }
        return gcd(n, m%n);
    }
}