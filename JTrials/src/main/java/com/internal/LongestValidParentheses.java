package com.internal;

import java.util.*;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        int maxLength = 0;
        int tempLength = 0;
        Stack<Integer> indexStack = new Stack<Integer>();
        //indexStack.push(-1);
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '('){
                if(indexStack.isEmpty())
                    indexStack.push(i-1);
                indexStack.push(i);
            }else{
                if(!indexStack.isEmpty())
                    indexStack.pop();
                if(!indexStack.isEmpty()) {
                    tempLength = i - indexStack.peek();
                    maxLength = Math.max(tempLength, maxLength);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("((()()("));//4
        System.out.println(longestValidParentheses("((()()(()"));//4
        System.out.println(longestValidParentheses("((()()(()()()()"));//8
        System.out.println(longestValidParentheses("((()()(((())))"));//12
        System.out.println(longestValidParentheses(")))((()()(((())))"));//12
        System.out.println(longestValidParentheses(")))"));//0
        System.out.println(longestValidParentheses("((("));//0
        System.out.println(longestValidParentheses(")))()"));//2
        System.out.println(longestValidParentheses(")))()((("));//2
        System.out.println(longestValidParentheses("()((("));//2
        System.out.println(longestValidParentheses("()()((("));//4
        System.out.println(longestValidParentheses("(()())((("));//6
        System.out.println(longestValidParentheses(")))(()())((("));//6
        System.out.println(longestValidParentheses(")))(()())"));//6

    }
}
