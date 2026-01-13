class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int ind = 0;

        for(int i = 0; i<n; i++) {
            if(nums[i] != 0) {
                nums[ind++] = nums[i];
            }
        }
        while(ind < n) {
            nums[ind++] = 0;
        }
    }
}