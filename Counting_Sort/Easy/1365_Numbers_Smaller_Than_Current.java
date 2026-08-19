class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];

        for(int each : nums) {
            freq[each]++;
        }

        for(int i = 1; i <= 100; i++) {
            freq[i] += freq[i-1];  // Storing all the previous minimum values
        }

        int[] ans = new int[n];
        for(int i = 0; i<n; i++) {
            if(nums[i] == 0) {
                ans[i] = 0;
            }
            else {
                ans[i] = freq[nums[i] - 1];
            }
        }

        return ans;
    }
}