package com.internal;

public class MaxScoreAfterSplittingString {
    public int maxScore(String s) {
        int maxScore = 0;
        for(int i=1;i<=s.length()-1;i++){
            String left = s.substring(0,i);
            String right = s.substring(i,s.length());

            int bLeft = left.replace("1","").length();
            int bRight = right.replace("0","").length();
            if(maxScore < bLeft+bRight)
                maxScore = bLeft+bRight;
        }
        return maxScore;
    }

    public static void main(String[] args) {
        System.out.println(new MaxScoreAfterSplittingString().maxScore("011101"));
        System.out.println(new MaxScoreAfterSplittingString().maxScore("00111"));
        System.out.println(new MaxScoreAfterSplittingString().maxScore("1111"));
        System.out.println(new MaxScoreAfterSplittingString().maxScore("00"));
    }
}
