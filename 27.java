class Solution {
    public int removeElement(int[] nums, int k) {
        int n = nums.length;

        int ind = 0;
        for(int i = 0; i<n; i++) {
            if(nums[i] != k) {
                nums[ind++] = nums[i];
            }
        }
        return ind;
    }
}