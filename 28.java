class Solution {
    public int strStr(String haystack, String needle) {
        // ------------------ Inbuilt
        // return haystack.indexOf(needle);

        // ------------------ Two Pointer
        int i = 0;
        int j = 0;

        while(i < haystack.length() && j < needle.length()) {
            if(haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            else {
                i = i - j + 1;
                j = 0;
            }
        }

        if(j == needle.length()) {
            return i - j;
        }

        return -1;

        // ------------------ Brute force

        // int n = haystack.length();

        // for (int i = 0; i < n - needle.length() + 1; i++) {
        //     boolean flag = true;
        //     for (int j = 0; j < needle.length(); j++) {
        //         if (needle.charAt(j) != haystack.charAt(j + i)) {
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if (flag) {
        //         return i;
        //     }
        // }
        // return -1;
    }
}