package com.internal;

public class CountBits {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            String iStr = Integer.toBinaryString(i).replace("0","");
            arr[i] = iStr.length();
        }
        return arr;
    }

    public static void main(String[] args) {
        new CountBits().countBits(3);
        new CountBits().countBits(2);
        new CountBits().countBits(5);
    }
}
