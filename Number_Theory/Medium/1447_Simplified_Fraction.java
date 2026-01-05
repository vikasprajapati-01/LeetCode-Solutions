class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();

        for(int i = 2; i<=n; i++) {
            for(int j = 1; j<i; j++) {
                if(gcd(j, i) == 1) {
                    ans.add(j + "/" + i);
                }
            }
        }
        return ans;
    }

    public int gcd(int m, int n) {
        if(n == 0) {
            return m;
        }
        return gcd(n, m%n);
    }
}