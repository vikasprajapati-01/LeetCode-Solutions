class Solution {
    public int romanToInt(String s) {
        int ans = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            if(i-1 > -1 && s.charAt(i) == 'V' && s.charAt(i-1) == 'I') {
                ans = ans + 4;
                i--;
                continue;
            }
            else if(i-1 > -1 && s.charAt(i) == 'X' && s.charAt(i-1) == 'I') {
                ans = ans + 9;
                i--;
                continue;
            }
            else if(i-1 > -1 && s.charAt(i) == 'L' && s.charAt(i-1) == 'X') {
                ans = ans + 40;
                i--;
                continue;
            }
            else if(i-1 > -1 && s.charAt(i) == 'C' && s.charAt(i-1) == 'X') {
                ans = ans + 90;
                i--;
                continue;
            }
            else if(i-1 > -1 && s.charAt(i) == 'D' && s.charAt(i-1) == 'C') {
                ans = ans + 400;
                i--;
                continue;
            }
            else if(i-1 > -1 && s.charAt(i) == 'M' && s.charAt(i-1) == 'C') {
                ans = ans + 900;
                i--;
                continue;
            }

            if(i > -1) {
                if(s.charAt(i) == 'I') {
                    ans = ans + 1;
                }
                else if(s.charAt(i) == 'V') {
                    ans = ans + 5;
                }
                else if(s.charAt(i) == 'X') {
                    ans = ans + 10;
                }
                else if(s.charAt(i) == 'L') {
                    ans = ans + 50;
                }
                else if(s.charAt(i) == 'C') {
                    ans = ans + 100;
                }
                else if(s.charAt(i) == 'D') {
                    ans = ans + 500;
                }
                else if(s.charAt(i) == 'M') {
                    ans = ans + 1000;
                }
            }
        }
        return ans;
    }
}