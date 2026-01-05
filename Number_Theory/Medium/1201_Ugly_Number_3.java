class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        int left = 1;
        int right = Integer.MAX_VALUE;

        while (left < right) {
            long mid = left + (right - left) / 2;
            if (count(a, b, c, mid) >= n) {
                right = (int) mid;
            } else {
                left = (int) mid + 1;
            }
        }

        return left;
    }

    public long count(long a, long b, long c, long mid) {
        return (mid / a) + (mid / b) + (mid / c) - (mid / lcm(a, b)) - (mid / lcm(b, c)) - (mid / lcm(a, c)) + (mid / lcm(lcm(a, b), c));
    }

    public long lcm(long a, long b) {
        return (a * b) / gcd(a, b); 
    }

    public long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
