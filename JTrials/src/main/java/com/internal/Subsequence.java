package com.internal;

public class Subsequence {
    private static boolean isSubsequence(String s, String t) {
        if(s.length() > t.length())
            return false;

        int sPtr=0 , tPtr=0;
        int countMatching=0;

        while(sPtr<s.length() && tPtr<t.length()){
            if(s.charAt(sPtr)==t.charAt(tPtr)){
                sPtr++;
                tPtr++;
                countMatching++;
            }else{
                tPtr++;
            }
        }
        if(countMatching == s.length())
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("aed","rawesd"));
        System.out.println(isSubsequence("aed","rawes"));
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("axc","ahbgdc"));

    }
}
