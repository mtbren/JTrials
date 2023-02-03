package com.internal;

public class ShortestDistanceToCharacter {
    public static int[] shortestToChar(String s, char c) {
        int[] distArr = new int[s.length()];
        int prevIndexOfC = s.indexOf(c,0);
        int nextIndexOfC = s.indexOf(c,0);;
        for(int i=0;i<s.length();i++){
            nextIndexOfC = s.indexOf(c,i);
            if(s.charAt(i)==c){
                distArr[i]=0;
                prevIndexOfC=i;
            }else{
                distArr[i]=Math.min(Math.abs(i-prevIndexOfC),Math.abs(i-nextIndexOfC));
            }
        }

        return distArr;
    }

    public static void main(String[] args) {
        shortestToChar("leetcode",'e');
        shortestToChar("aaab",'b');
        shortestToChar("baaabbbb",'b');
        shortestToChar("b",'b');

    }
}
