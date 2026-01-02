class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length == 1) {
            return false;
        }
        int max = -1;
        for(int each : deck) {
            max = Math.max(each,max);
        }
        int[] flag = new int[max+1];
        for(int each : deck) {
            flag[each]++;
        }

        int ans = 0;
        for(int each : flag) {
            if(each != 0) {
                ans = gcd(ans, each);
            }
        }
        return ans > 1;
    }

    public int gcd(int m, int n) {
        if(n == 0) {
            return m;
        }
        return gcd(n, m%n);
    }
}