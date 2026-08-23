class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length - 1;
        int pivot = -1;

        for(int i = n-1; i>=0; i--) {
            if(nums[i+1] > nums[i]) {
                pivot = i;
                break;
            }
        }
        
        if(pivot != -1) {
            for(int i = n; i>=0; i--) {
                if(nums[pivot] < nums[i]) {
                    swap(nums, i, pivot);
                    break;
                }
            }
        }

        while(pivot + 1 < n) {
            swap(nums, pivot + 1, n);
            pivot++;
            n--;
        }

        return;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}