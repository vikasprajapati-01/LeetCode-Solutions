class Solution {
    public int gcdOfOddEvenSums(int n) {

        // ------ Square and (+1 and then square)

        int odd = n * n;  
        int even = n * (n+1);

        return gcd(odd, even);

        // ------ Brute

        // int odd = 1;
        // int even = 2;
        // int sumOdd = 0;
        // int sumEven = 0;
        // for(int i = 1; i<=n; i++) {
        //     sumOdd += odd;
        //     odd += 2;
        //     sumEven += even;
        //     even += 2;
        // }

        // return gcd(sumOdd, sumEven);
    }

    public int gcd(int m, int n) {
        if(n <= 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}