package com.internal;

public class RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        StringBuffer orig = new StringBuffer(s);
        StringBuffer copy = new StringBuffer(s).reverse();

        if(orig.toString().equals(copy.toString()))
            return 1;
        else
            return 2;
    }

    public static void main(String[] args) {
        System.out.println(new RemovePalindromicSubsequences().removePalindromeSub("ababa"));
        System.out.println(new RemovePalindromicSubsequences().removePalindromeSub("abb"));
        System.out.println(new RemovePalindromicSubsequences().removePalindromeSub("baabb"));
    }
}
