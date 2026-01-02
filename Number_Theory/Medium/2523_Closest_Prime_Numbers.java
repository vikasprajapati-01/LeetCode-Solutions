class Solution {
    public int[] closestPrimes(int left, int right) {

        boolean[] flag = new boolean[right + 1];
        Arrays.fill(flag, true);
        flag[0] = flag[1] = false;
        
        for (int i = 2; i * i <= right; i++) {
            if (flag[i]) {
                for (int j = i * i; j <= right; j += i) {
                    flag[j] = false;
                }
            }
        }
        
        List<Integer> primes = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (flag[i]) {
                primes.add(i);
            }
        }
        
        if (primes.size() < 2) {
            return new int[]{-1, -1};
        }
        
        int min = Integer.MAX_VALUE;
        int[] ans = {-1, -1};
        
        for (int i = 1; i < primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if (diff < min) {
                min = diff;
                ans[0] = primes.get(i - 1);
                ans[1] = primes.get(i);
            }
        }
        
        return ans;

        // ------ Brute force

        // int[] primes = new int[right - left + 1];
        // int index = 0;
        // for(int i = left; i <= right; i++) {
        //     if(prime(i)) {
        //         primes[index++] = i;
        //     }
        // }

        // if(index < 2) {
        //     return new int[]{-1, -1};
        // }
        
        // int n1 = -1;
        // int n2 = -1;
        // int diff = Integer.MAX_VALUE;

        // // index has the number of primes
        // for(int i = 0; i < index - 1; i++) {
        //     int a = primes[i];
        //     int b = primes[i+1];
        //     if(a != 0 && b != 0) {
        //         if(diff > b - a) {
        //             diff = b - a;
        //             n1 = a;
        //             n2 = b;
        //         }
        //     }
        //     else {
        //         break;
        //     }
        // }

        // return new int[]{n1, n2};
    }

    // public boolean prime(int n) {
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