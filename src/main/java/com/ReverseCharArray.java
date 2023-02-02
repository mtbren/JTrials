package com;

import java.util.Arrays;

public class ReverseCharArray {
    private static void reverseString(char[] s) {
        int left =0 , right = s.length-1;
        char temp;
        while(left < right){
            temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }
}
