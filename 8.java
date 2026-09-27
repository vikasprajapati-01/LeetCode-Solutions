class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int n = s.length();
        if(n == 0) {
            return 0;
        }

        int i = 0;
        int sign = 1;
        if(s.charAt(i) == '+') {
            i++;
        }
        else if(s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        long ans = 0;
        while(i < n && Character.isDigit(s.charAt(i))) {
            ans = ans * 10 + (s.charAt(i) - '0');

            if(sign == -1 && -ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if(sign == 1 && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            i++;
        }

        return sign * (int)ans;
    }
}