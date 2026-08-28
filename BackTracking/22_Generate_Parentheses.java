class Solution {
    public List<String> generateParenthesis(int n) {
        return backtrack(new ArrayList<String>(), new StringBuilder(), 0, 0, n);
    }

    public List<String> backtrack(List<String> ans, StringBuilder s, int open, int close, int n) {
        if(s.length() == 2*n) {
            ans.add(s.toString());
            return ans;
        }

        if(open < n) {
            s.append('(');
            backtrack(ans, s, open + 1, close, n);
            s.deleteCharAt(s.length() - 1);
        }
        if(close < open) {
            s.append(')');
            backtrack(ans, s, open, close + 1, n);
            s.deleteCharAt(s.length() - 1);
        }

        return ans;
    }
}