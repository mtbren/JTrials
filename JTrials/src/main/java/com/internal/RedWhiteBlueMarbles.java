package com.internal;

import java.util.Arrays;

public class RedWhiteBlueMarbles {
    // 0=Red, 1=White, 2=Blue
    private static int[] arrangeMarbles(int[] marbles) {
        int rBorder = 0, bBorder = marbles.length - 1;
        int i = 0;
        int temp;
        while(i<=bBorder){
            if(marbles[i]==0){
                //swap
                temp = marbles[rBorder];
                marbles[rBorder] = marbles[i];
                marbles[i] = temp;
                rBorder ++;
                i++;
            }else if(marbles[i]==2){
                //swap
                temp = marbles[bBorder];
                marbles[bBorder] = marbles[i];
                marbles[i] = temp;
                bBorder --;
            }else if(marbles[i]==1){
                i++;
            }
        }
        return marbles;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,1,2,2,1,2,1,0,0,2,1,2,2,0};
        //int[] arr = new int[]{3,2,4,1,6,3,7,5};
        arr = arrangeMarbles(arr);
        printArr(arr);
    }

    private static void printArr(int[] arr){
        Arrays.stream(arr).forEach(i-> System.out.print(" "+i));
        System.out.println();
    }

}
