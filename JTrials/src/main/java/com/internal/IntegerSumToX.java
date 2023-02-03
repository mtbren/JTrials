package com.internal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntegerSumToX {
    private static int[] sumToX(int[] arr, int x){
        Set<Integer> nos = new HashSet<Integer>();
        int[] ret;
        for(int i=0;i<arr.length;i++){
            if (nos.contains(x-arr[i]))
                return new int[]{arr[i],x-arr[i]};
            if(!nos.contains(arr[i]))
                nos.add(arr[i]);
        }
        return null;
    }

    public static void main(String[] args) {
        Arrays.stream(sumToX(new int[]{1, 3, 4, 5, 7, 9}, 16)).forEach(i-> System.out.println(i));
    }
}
