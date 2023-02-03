package com.internal;

public class BuddySwap {
    public static boolean buddyStrings(String s, String goal) {
        StringBuilder sBldr = new StringBuilder(s);
        if(s.length()!=goal.length())
            return false;
        if(s.equals(goal)){
            for(int i=0;i<s.length();i++){
                if(i != s.lastIndexOf(s.charAt(i)))
                    return true;
            }
            return false;
        }else{
            int mismatchCount = 0;
            int[] mismatchIndex = new int[2];
            mismatchIndex[0]=-1; mismatchIndex[1]=-1;
            for (int i=0;i<s.length();i++){
                if(s.charAt(i)!=goal.charAt(i)) {
                    mismatchCount++;
                    if(mismatchCount>2)
                        return false;
                    else
                        mismatchIndex[mismatchCount-1]=i;
                }
            }
            if(mismatchCount!=2)
                return false;

            sBldr = sBldr.replace(mismatchIndex[0],mismatchIndex[0]+1,""+s.charAt(mismatchIndex[1]));
            sBldr = sBldr.replace(mismatchIndex[1],mismatchIndex[1]+1,""+s.charAt(mismatchIndex[0]));
        }
        return sBldr.toString().equals(goal);
    }

    public static void main(String[] args) {
        System.out.println(buddyStrings("puma","upma"));//true
        System.out.println(buddyStrings("ppma","upma"));//false
        System.out.println(buddyStrings("ab","ba"));//true
        System.out.println(buddyStrings("ab","ab"));//false
        System.out.println(buddyStrings("aa","aa"));//true
        System.out.println(buddyStrings("a","a"));//false
    }

}
