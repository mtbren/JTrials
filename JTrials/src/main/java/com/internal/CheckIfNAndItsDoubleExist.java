package com.internal;

import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int lPtr = 0, rPtr = 0;

        while(rPtr < arr.length && lPtr < arr.length){
            while(rPtr < arr.length && arr[rPtr] < 2*arr[lPtr]){
                rPtr ++;
            }
            if(rPtr >= arr.length)
                return false;
            if(arr[rPtr] == 2*arr[lPtr] && lPtr!=rPtr)
                return true;

            lPtr++;
        }
        return false;
    }

    public static void main(String[] args) {
        //System.out.println(new CheckIfNAndItsDoubleExist().checkIfExist(new int[]{10,2,5,3}));
        //System.out.println(new CheckIfNAndItsDoubleExist().checkIfExist(new int[]{-2,0,10,-19,4,6,-8}));
        System.out.println(new CheckIfNAndItsDoubleExist().checkIfExist(new int[]{-2,0,10,-4}));
    }
}
