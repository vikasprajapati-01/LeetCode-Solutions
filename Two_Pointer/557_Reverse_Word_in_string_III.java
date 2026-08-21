class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();

        int left = 0;
        for(int i = 0; i<=ch.length; i++) {
            if(i == ch.length || ch[i] == ' ') {
                int right = i - 1;

                while(left < right) {
                    char temp = ch[left];
                    ch[left++] = ch[right];
                    ch[right--] = temp;
                }
                left = i + 1;
            }
        }

        return new String(ch);

        // String[] str = s.split(" ");

        // return rev(str);
    }

    // public String rev(String[] str) {
    //     int n = str.length;

    //     String[] ans = new String[n];
    //     int ind = 0;

    //     for(String each : str) {
    //         char[] ch = each.toCharArray();

    //         int left = 0;
    //         int right = ch.length - 1;

    //         while(left < right) {
    //             char temp = ch[left];
    //             ch[left] = ch[right];
    //             ch[right] = temp;

    //             left++;
    //             right--;
    //         }
    //         ans[ind++] = new String(ch);
    //     }

    //     return String.join(" ", ans);
    // }
}