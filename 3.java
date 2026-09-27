class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int i = 0;
        // int j = 0;
        // int ans = 0;
        // Set<Character> set = new HashSet<>();
        // while(j < s.length()) {
        //     if(!set.contains(s.charAt(j))) {
        //         set.add(s.charAt(j));
        //         ans = Math.max(ans, j - i + 1);
        //         j++;
        //     }
        //     else {
        //         set.remove(s.charAt(i++));
        //     }
        // }

        // return ans;

        int i = 0;
        int j = 0;
        int ans = 0;
        Set<Character> set = new HashSet<>();
        while(j < s.length()) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                ans = Math.max(ans, j - i + 1);
                j++;
            }
            else {
                while(s.charAt(i) != s.charAt(j)) {
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }

        return ans;
    }
}