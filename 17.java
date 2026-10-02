class Solution {
    String[] data = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        backtrack(digits, new StringBuilder(), 0, ans);
        return ans;
    }

    private void backtrack(String digits, StringBuilder cur, int ind, List<String> ans) {
        if(ind == digits.length()) {
            ans.add(cur.toString());
            return;
        }

        for(int i = 0; i<data[digits.charAt(ind) - '2'].length(); i++) {
            cur.append(data[digits.charAt(ind) - '2'].charAt(i));
            backtrack(digits, cur, ind + 1, ans);
            cur.deleteCharAt(cur.length() - 1);
        }

        return;
    }

    // private void backtrack(String digits, String cur, int ind, List<String> ans) {
    //     if(ind == digits.length()) {
    //         ans.add(cur);
    //         return;
    //     }

    //     for(int i = 0; i<data[digits.charAt(ind) - '2'].length(); i++) {
    //         backtrack(digits, cur + data[digits.charAt(ind) - '2'].charAt(i), ind + 1, ans);
    //     }

    //     return;
    // }
}