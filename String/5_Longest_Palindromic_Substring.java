class Solution {
    public String longestPalindrome(String s) {

        int max = 0;
        int start = 0;
        int end = 0;

        for(int i = 0; i<s.length(); i++) {
            int left = i - 1;
            int right = i + 1;

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if(right - left + 1 > max) {
                    start = left;
                    end = right;
                    max = right - left + 1;
                }

                left--;
                right++;
            }
        }

        for(int i = 0; i<s.length(); i++) {
            int left = i;
            int right = i + 1;

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if(right - left + 1 > max) {
                    start = left;
                    end = right;
                    max = right - left + 1;
                }

                left--;
                right++;
            }
        }

        return s.substring(start, end + 1);
    }
}