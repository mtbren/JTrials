package com.internal;

public class CountSubstringWithOneDistinctLetter {
    public int countLetters(String s) {
        int finalComb = 0;
        for (int i = 0; i < s.length(); i++) {
            int j=i+1;
            while(j<s.length() && s.charAt(j)==s.charAt(i))
                j++;
            int comb = ((j-i)*(j-i+1))/2;
            finalComb += comb;
            i=j-1;
        }
        return finalComb;
    }

    public static void main(String[] args) {
        System.out.println(new CountSubstringWithOneDistinctLetter().countLetters(
                "aaaba"
        ));//8
        System.out.println(new CountSubstringWithOneDistinctLetter().countLetters(
                "aaaaaaaaaa"
        ));//55
    }
}
