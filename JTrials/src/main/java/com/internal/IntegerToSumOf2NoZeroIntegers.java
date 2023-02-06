package com.internal;

import java.util.Arrays;

public class IntegerToSumOf2NoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        int n1, n2;
        int var1 = 2;
        while(true){
            n1 = n/var1;
            n2 = n - n1;
            if (String.valueOf(n1).contains("0") || String.valueOf(n2).contains("0"))
                var1++;
            else
                break;
        }
        return new int[]{n1,n2};
    }

    public static void main(String[] args) {
        Arrays.stream(new IntegerToSumOf2NoZeroIntegers().getNoZeroIntegers(1010)).forEach(System.out::println);
    }
}
