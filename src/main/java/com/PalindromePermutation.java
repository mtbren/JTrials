package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
    private static boolean canPermutePalindrome(String s) {
        Set<Character> oddNoOfChars = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            if (!oddNoOfChars.add(s.charAt(i)))
                oddNoOfChars.remove(s.charAt(i));
        }
        if(oddNoOfChars.size()>1)
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("aab"));//true
        System.out.println(canPermutePalindrome("code"));//false
        System.out.println(canPermutePalindrome("carerac"));//true
    }
}
