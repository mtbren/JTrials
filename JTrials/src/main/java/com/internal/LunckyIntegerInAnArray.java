package com.internal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LunckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);

        int count = 1;
        for (int i = arr.length - 2; i >= 0; i--){
            if(arr[i]==arr[i+1])
                count++;
            else
                count = 1;
            if(count == arr[i] ){
                if(i==0)
                    return arr[i];
                else if(i>0 && arr[i-1]!=arr[i])
                    return arr[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new LunckyIntegerInAnArray().findLucky(new int []{2,2,3,4}));
        System.out.println(new LunckyIntegerInAnArray().findLucky(new int []{1,2,2,3,3,3}));
        System.out.println(new LunckyIntegerInAnArray().findLucky(new int []{2,2,2,3,3}));
    }
}
