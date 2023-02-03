package com.internal;

public class SplitStringIntoBalancedStrings {
    public int balancedStringSplit(String s) {
        int counterR = 0;
        int counterL = 0;
        int countSplit = 0;

        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='R') {
                counterR ++;
            }else if(s.charAt(i)=='L') {
                counterL ++;
            }
            if(counterL == counterR){
                countSplit ++;
                counterR = 0;
                counterL = 0;
            }
        }
        return countSplit;
    }

    public static void main(String[] args) {
        System.out.println(new SplitStringIntoBalancedStrings().balancedStringSplit(
                "RLRRLLRLRL"
        ));
        System.out.println(new SplitStringIntoBalancedStrings().balancedStringSplit(
                "RLRRRLLRLL"
        ));
        System.out.println(new SplitStringIntoBalancedStrings().balancedStringSplit(
                "LLLLRRRR"
        ));
    }
}
