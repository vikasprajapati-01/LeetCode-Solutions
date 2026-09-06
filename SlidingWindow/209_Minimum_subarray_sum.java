class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if(nums[0] == target || nums[n-1] == target) {
            return 1;
        }
        int i = 0;
        int j = 0;

        int sum = 0;
        int ans = 0;
        while(j < n) {
            if(sum == target) {
                ans = Math.max(j - i + 1, ans);
                i++;
                j++;
            }
            else if(sum > target) {
                sum -= nums[i];
                i++;
            }
            else {
                sum += nums[j];
                j++;
            }
        }

        return ans;
    }
}