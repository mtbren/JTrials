package com;

public class CoinArranger {
    private static int arrangeCoins(int n) {
        int left = n;
        int i;
        for(i=1;left>=i;left-=i,i++);
        return --i;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
    }
}
