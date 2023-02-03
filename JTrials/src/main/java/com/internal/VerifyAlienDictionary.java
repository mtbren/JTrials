package com.internal;

public class VerifyAlienDictionary {
    public static boolean isAlienSorted(String[] words, String order) {
        String s1, s2;
        for(int i=0;i<words.length-1;i++){
            s1 = words[i];
            s2 = words[i+1];

            if(s1.indexOf(s2)==0) {
                if (s1.length() > s2.length())
                    return false;
                else
                    continue;
            }else{
                int shorterLength = s1.length() > s2.length() ? s2.length() : s1.length();
                for(int j=0;j<shorterLength;j++){
                    if(order.indexOf(s1.charAt(j))<order.indexOf(s2.charAt(j))){
                        break;
                    }else if(order.indexOf(s1.charAt(j))==order.indexOf(s2.charAt(j))) {
                        continue;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAlienSorted(new String[]{"hello","leetcode"},
                "hlabcdefgijkmnopqrstuvwxyz")); // true
        System.out.println(isAlienSorted(new String[]{"word","world","row"},
                "worldabcefghijkmnpqstuvxyz")); //false
        System.out.println(isAlienSorted(new String[]{"apple","app"},
                "abcdefghijklmnopqrstuvwxyz")); //false

    }
}
