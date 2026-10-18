class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivot(nums, nums.length - 1);

        if(pivot == -1) {
            return binary(nums, target, 0, nums.length - 1);
        }
        else if(target > nums[0]) {
            return binary(nums, target, 0, pivot);
        }

        return binary(nums, target, pivot + 1, nums.length - 1);
    }

    int pivot(int[] nums, int n) {
        int start = 0;
        int end = n;

        while(start <= end) {
            int mid = start + (end - start) / 2;
        }
    }
}