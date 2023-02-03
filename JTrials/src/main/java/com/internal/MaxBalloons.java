package com.internal;

import java.util.*;

public class MaxBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] balloonArr = new int[5]; // balon

        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='b')
                balloonArr[0] = balloonArr[0] + 1;
            else if(text.charAt(i)=='a')
                balloonArr[1] = balloonArr[1] + 1;
            else if(text.charAt(i)=='l')
                balloonArr[2] = balloonArr[2] + 1;
            else if(text.charAt(i)=='o')
                balloonArr[3] = balloonArr[3] + 1;
            else if(text.charAt(i)=='n')
                balloonArr[4] = balloonArr[4] + 1;
        }
        balloonArr[2] = balloonArr[2] / 2; // if char is 'l'
        balloonArr[3] = balloonArr[3] / 2; // if char is 'o'

        Arrays.sort(balloonArr);
        return balloonArr[0];
    }

    public static void main(String[] args) {
        MaxBalloons mb = new MaxBalloons();
        System.out.println(mb.maxNumberOfBalloons("loonbalxballpoon"));//2
        System.out.println(mb.maxNumberOfBalloons("leetcode"));//0
        System.out.println(mb.maxNumberOfBalloons("nlaebolko"));//1
    }
}
