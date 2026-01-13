class Solution {
    public int heightChecker(int[] heights) {

        int[] freq = new int[101];
        for(int each : heights) {
            freq[each]++;
        }

        int ind = 0;
        int ans = 0;
        for(int i = 1; i<=100; i++) {
            while(freq[i] > 0) {
                if(heights[ind] != i) {
                    ans++;
                }
                ind++;
                freq[i]--;
            }
        }

        return ans;

        // int n = heights.length;

        // int[] temp = new int[n];
        // int ans = 0;

        // for(int i = 0; i<n; i++) {
        //     temp[i] = heights[i];
        // }
        // Arrays.sort(temp);

        // for(int i = 0; i<n; i++) {
        //     if(heights[i] != temp[i]) {
        //         ans++;
        //     }
        // }

        // return ans;
    }
}