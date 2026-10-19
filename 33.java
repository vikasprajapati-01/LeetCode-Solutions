class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivot(nums, nums.length - 1);

        if(pivot == -1) {
            return binary(nums, target, 0, nums.length - 1);
        }
        else if(target >= nums[0]) {
            return binary(nums, target, 0, pivot);
        }

        return binary(nums, target, pivot + 1, nums.length - 1);
    }

    private int pivot(int[] nums, int n) {
        int start = 0;
        int end = n;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if(nums[start] < nums[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private int binary(int[] nums, int target, int start, int end) {
        while(start <=  end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}