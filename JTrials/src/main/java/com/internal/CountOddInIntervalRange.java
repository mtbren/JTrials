package com.internal;

public class CountOddInIntervalRange {
    public int countOdds(int low, int high) {
        if(high % 2 != 0 || low % 2 != 0 )
            return (high-low)/2 + 1;
        return (high-low)/2;
    }

    public static void main(String[] args) {
        System.out.println(new CountOddInIntervalRange().countOdds(3,7));
        System.out.println(new CountOddInIntervalRange().countOdds(8,10));
    }
}
