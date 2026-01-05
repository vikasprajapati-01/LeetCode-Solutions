class Solution {
    public int primePalindrome(int n) {

        do {
            if(isPrime(n) && isPalin(n)) {
                return n;
            }
            n++;
            if(n > 10000000 && n < 100000000) {
                n = 100000000;
            }
        } while(true);

        // ------ TLE

        // if(n <= 1) {
        //     return 2;
        // }

        // for(int i = n; i <= 100000000; i++) {
        //     if(isPrime(i)) {
        //         if(isPalin(i)) {
        //             return i;
        //         }
        //     }
        // }
        // return -1;
    }

    public boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        if(n == 2 || n == 3) {
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for(int i = 5; i*i<=n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalin(int n) {
        int temp = n;
        int rev = 0;
        while(temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        return rev == n;
    }
}