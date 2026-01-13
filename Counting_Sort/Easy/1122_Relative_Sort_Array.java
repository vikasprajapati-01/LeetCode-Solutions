class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];

        for(int each : arr1) {
            freq[each]++;
        }

        int ind = 0;
        for(int each : arr2) {
            while(freq[each] > 0) {
                arr1[ind++] = each;
                freq[each]--;
            }
        }

        for(int i = 0; i<=1000; i++) {
            while(freq[i] > 0) {
                arr1[ind++] = i;
                freq[i]--;
            }
        }

        return arr1;
    }
}