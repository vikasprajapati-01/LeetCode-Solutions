class Solution {
    public int arrayPairSum(int[] nums) {

        // range is -10000 to +10000 so adding 10000
        int[] freq = new int[20001];
        for(int each : nums) {
            freq[each + 10000]++;
        }

        int ans = 0;
        boolean flag = true;
        int n = freq.length;
        for(int i = 0; i<n; i++) {
            while(freq[i] > 0) {
                if(flag) {
                    ans += i - 10000;
                }
                flag = !flag; // this is to skip the 2nd number
                freq[i]--;
            }
        }

        return ans;

        // Arrays.sort(nums);
        // int n = nums.length;

        // int ans = 0;
        // for(int i = 0; i<n; i += 2) {
        //     ans += nums[i];
        // }

        // return ans;
    }
}