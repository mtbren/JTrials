package com.internal;

public class ReverseStringRecursive {
    public void reverseString(char[] s) {
        reverseString(s,0);
        System.out.println(s);
    }
    private void reverseString(char[] s, int index){
        if(index >= s.length/2)
            return;
        char temp = s[index];
        reverseString(s,index+1);
        s[index] = s[s.length-1-index];
        s[s.length-1-index] = temp;

    }

    public static void main(String[] args) {
        new ReverseStringRecursive().reverseString(new char[]{'a','m','i','t'});
        new ReverseStringRecursive().reverseString(new char[]{'t','h','e','i','r'});
    }

}
