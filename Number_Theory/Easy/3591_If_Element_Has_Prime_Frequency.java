class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int n = nums.length;

        boolean[] flag = new boolean[101];
        Arrays.fill(flag, true);
        flag[0] = flag[1] = false;

        for(int i = 2; i<n; i++) {
            if(flag[i]) {
                for(int j = i * i; j<101; j += i) {
                    flag[j] = false;
                }
            }
        }

        int max = -1;
        for(int each : nums) {
            max = Math.max(each, max);
        }
        int[] arr = new int[max+1];
        for(int i = 0; i<n; i++) {
            arr[nums[i]]++;
        }

        for(int i = 0; i<=max; i++) {
            if(arr[i] != 0) {
                if(flag[arr[i]]) {
                    return true;
                }
            }
        }
        return false;
    }

    // ------ Using prime method

    // public boolean isPrime(int n) {
    //     if(n <= 1) {
    //         return false;
    //     }
    //     if(n == 2 || n == 3) {
    //         return true;
    //     }
    //     if(n % 2 == 0 || n % 3 == 0) {
    //         return false;
    //     }
    //     for(int i = 5; i*i < n; i++) {
    //         if(n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}