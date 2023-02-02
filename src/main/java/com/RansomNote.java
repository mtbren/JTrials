package com;

import java.util.Arrays;

public class RansomNote {
    private static boolean canConstruct(String ransomNote, String magazine) {

        if (magazine.length() < ransomNote.length())
            return false;

        char[] rArr = ransomNote.toCharArray();
        char[] mArr = magazine.toCharArray();
        Arrays.sort(rArr);
        Arrays.sort(mArr);

        int rPtr = 0, mPtr = 0;

        while (rPtr < rArr.length && mPtr < mArr.length) {
            if (rArr[rPtr] == mArr[mPtr]) {
                rPtr++;
                mPtr++;
            } else if (rArr[rPtr] < mArr[mPtr] || rArr.length-rPtr > mArr.length-mPtr) {
                return false;
            } else{
                if(mPtr == mArr.length-1)
                    return false;
                mPtr++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        /*System.out.println(canConstruct("a","b"));
        System.out.println(canConstruct("aa","ab"));
        System.out.println(canConstruct("aa","aab"));
        System.out.println(canConstruct("bg",
                "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));*/
        System.out.println(canConstruct("fihjjjjei",
                "hjibagacbhadfaefdjaeaebgi"));
    }
}
