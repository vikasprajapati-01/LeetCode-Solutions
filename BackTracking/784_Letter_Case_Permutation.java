class Solution {
    public List<String> letterCasePermutation(String s) {

        return func1(new StringBuilder(s), 0, new ArrayList<String>());

        // ------------------------ Not optimized

        // return func2(s, 0, "", new ArrayList<String>());
    }

    public List<String> func1(StringBuilder s, int ind, List<String> list) {
        if (ind == s.length()) {
            list.add(s.toString());
            return list;
        }

        char ch = s.charAt(ind);

        if (Character.isLetter(ch)) {
            s.setCharAt(ind, Character.toLowerCase(ch));
            func1(s, ind + 1, list);

            s.setCharAt(ind, Character.toUpperCase(ch));
            func1(s, ind + 1, list);
        }
        else {
            func1(s, ind + 1, list);
        }

        return list;
    }

    // public List<String> func2(String s, int ind, String str, List<String> list) {
    //     if (ind == s.length()) {
    //         list.add(str);
    //         return list;
    //     }

    //     char ch = s.charAt(ind);

    //     if (Character.isLetter(ch)) {
    //         if (Character.isUpperCase(ch)) {
    //             func2(s, ind + 1, str + ch, list);

    //             func2(s, ind + 1, str + Character.toLowerCase(ch), list);
    //         }
    //         else {
    //             func2(s, ind + 1, str + ch, list);

    //             func2(s, ind + 1, str + Character.toUpperCase(ch), list);
    //         }
    //     }
    //     else {
    //         func2(s, ind + 1, str + ch, list);
    //     }

    //     return list;
    // }
}