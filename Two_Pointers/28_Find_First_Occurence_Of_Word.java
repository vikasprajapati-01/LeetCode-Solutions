class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();

        for (int i = 0; i < n - needle.length() + 1; i++) {
            boolean flag = true;
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(j + i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;

        int n = haystack.length();

        if(n < needle.length()) {
            return -1;
        }

        for(int i = 0; i<n; i++) {
            int j = 0;
            if(haystack.charAt(i) == needle.charAt(j)) {
                for(; j<needle.length(); j++) {
                    if(i+j >= n) {
                        break;
                    }
                    if(haystack.charAt(i+j) != needle.charAt(j)) {
                        break;
                    }
                }
            }
            if(j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}