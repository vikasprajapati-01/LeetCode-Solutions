class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n <= 2) {
            return n;
        }
        int max = nums[0];
        int min = nums[0];
        int maxInd = 0;
        int minInd = 0;
        for(int i = 1; i<n; i++) {
            if(max < nums[i]) {
                max = nums[i];
                maxInd = i;
            }
            if(min > nums[i]) {
                min = nums[i];
                minInd = i;
            }
        }

        int left = Math.min(minInd, maxInd);
        int right = Math.max(minInd, maxInd);

        int ans = Math.min(right + 1, n - left);
        ans = Math.min(ans, (left + 1) + (n - right));
        
        return ans;

        // int fromStart = right + 1;
        // int fromEnd = n - left;
        // int bothEnd = (left + 1) + (n - right);

        // return Math.min(fromStart, Math.min(fromEnd, bothEnd));
    }
}