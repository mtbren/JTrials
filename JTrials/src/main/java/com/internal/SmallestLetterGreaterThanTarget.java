package com.internal;

public class SmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int c;
        int t = target;
        for(int i=0;i<letters.length;i++){
            c = letters[i];
            if (c>t)
                return (char)c;
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c','f','g'},'a'));
        System.out.println(nextGreatestLetter(new char[]{'c','f','g'},'c'));
        System.out.println(nextGreatestLetter(new char[]{'c','f','g'},'d'));

    }
}
