package com;

public class RemoveOutermostParentheses {
    public static String removeOuterParentheses(String s) {
        if (s == null || s.length() == 0)
            return s;
        StringBuffer finalString = new StringBuffer();
        int leftP = 1;
        int rightP = 0;
        for (int i = 1; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                leftP++;
            } else if (')' == s.charAt(i)) {
                rightP++;
            }
            if (leftP != rightP) {
                finalString.append(s.charAt(i));
            } else {
                leftP = 1;
                rightP = 0;
                i += 1;
            }
        }
        return finalString.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(removeOuterParentheses("()()"));
    }
}
