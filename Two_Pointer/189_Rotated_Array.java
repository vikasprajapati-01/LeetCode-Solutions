class Solution {
    public void rotate(int[] nums, int k) {
        // int n = nyums.length;
        k %= nums.length;
        if(k < 0) {
            k += nums.length;
        }

        rev(0, nums.length-1, nums);
        rev(0, k-1, nums);
        rev(k, nums.length-1, nums);

        // if(n == 1) {
        //     return;
        // }

        // k = k % n;
        // if(k < 1){
        //     return;
        // }
        // int i = 0;
        // int j = n-1;
        // while(i < j) {
        //     int temp = nums[i];
        //     nums[i++] = nums[j];
        //     nums[j--] = temp;
        // }

        // i = 0;
        // j = k-1;
        // while(i < n-1 && i < j) {
        //     int temp = nums[i];
        //     nums[i++] = nums[j];
        //     nums[j--] = temp;
        // }
        // i = k;
        // j = n-1;
        // while(i < j) {
        //     int temp = nums[i];
        //     nums[i++] = nums[j];
        //     nums[j--] = temp;
        // }
    }

    public void rev(int start, int end, int[] nums) {
        while(start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}