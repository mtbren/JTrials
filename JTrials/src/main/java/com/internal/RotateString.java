package com.internal;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        StringBuilder sB = new StringBuilder(s);
        if(s.equals(goal))
            return true;
        if(s.length()!=goal.length())
            return false;

        if(s.length()==1)
            return s.equals(goal);

        int move = -1;
        int counter = goal.lastIndexOf(goal.charAt(0));
        while(counter>=0){
            move = sB.indexOf(""+goal.charAt(0));
            if(move < 0)
                return false;
            sB = new StringBuilder(sB.substring(move).concat(sB.substring(0,move)));
            if(sB.toString().equals(goal)){
                return true;
            }else{
                sB = sB.append(sB.charAt(0)).deleteCharAt(0);
            }
            if(sB.toString().equals(s)){
                break;
            }
            counter--;
            if(counter<=0)
                break;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));//true
        System.out.println(rotateString("abcde","deabc"));//true
        System.out.println(rotateString("abcde","abced"));//false
        System.out.println(rotateString("a","b"));//false
        System.out.println(rotateString("ab","ba"));//true
        System.out.println(rotateString("ohbrwzxvxe","uornhegseo"));//false;
        System.out.println(rotateString("bbbacddceeb","ceebbbbacdd"));//true
    }
}
