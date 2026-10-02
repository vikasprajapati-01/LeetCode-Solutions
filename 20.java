class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                stack.push(')');
            }
            else if(ch == '{') {
                stack.push('}');
            }
            else if(ch == '[') {
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }
        
        return stack.isEmpty();

        // Stack<Character> stack = new Stack<>();

        // for(int i = 0; i<s.length(); i++) {
        //     char ch = s.charAt(i);
        //     if(ch == '(' || ch == '{' || ch == '[') {
        //         stack.push(ch);
        //     }
        //     else {
        //         if(stack.isEmpty()) {
        //             return false;
        //         }

        //         char end = stack.pop();
        //         if(end == '(' && ch != ')') {
        //             return false;
        //         }
        //         else if(end == '{' && ch != '}') {
        //             return false;
        //         }
        //         else if(end == '[' && ch != ']') {
        //             return false;
        //         }
        //     }
        // }
        
        // return stack.isEmpty();
    }
}