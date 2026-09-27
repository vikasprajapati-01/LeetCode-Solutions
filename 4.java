class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] arr = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int ind = 0;
        while(i < n1 && j < n2) {
            if(nums1[i] <= nums2[j]) {
                arr[ind++] = nums1[i++];
            }
            else {
                arr[ind++] = nums2[j++];
            }
        }
        while(i < n1) {
            arr[ind++] = nums1[i++];
        }
        while(j < n2) {
            arr[ind++] = nums2[j++];
        }

        if(arr.length % 2 != 0) {
            return (double)arr[arr.length / 2];
        }

        return (double)(arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
    }
}