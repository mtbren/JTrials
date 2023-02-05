package com.internal;

import java.util.Arrays;

public class FindNUniqueIntSum0 {
    public int[] sumZero(int n) {
        int currVal = 1;
        int[] retArr = new int[n];
        int pointer = 0;
        for(int i=0;i<n-1;i+=2){
            retArr[pointer++] = currVal;
            retArr[pointer++] = -currVal;
            currVal++;
        }
        return retArr;
    }

    public static void main(String[] args) {
        //Arrays.stream(new FindNUniqueIntSum0().sumZero(5)).forEach(System.out::println);
        //Arrays.stream(new FindNUniqueIntSum0().sumZero(4)).forEach(System.out::println);
        //Arrays.stream(new FindNUniqueIntSum0().sumZero(3)).forEach(System.out::println);
        //Arrays.stream(new FindNUniqueIntSum0().sumZero(2)).forEach(System.out::println);
        Arrays.stream(new FindNUniqueIntSum0().sumZero(1)).forEach(System.out::println);
    }
}
