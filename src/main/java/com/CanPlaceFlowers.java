package com;

public class CanPlaceFlowers {
    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length ; i++) {
            if (flowerbed[i] == 0) {
                if ((i>0 && flowerbed[i - 1] == 1) || (i < flowerbed.length-1 && flowerbed[i + 1] == 1)) {
                    continue;
                } else {
                    count++;
                    i++;
                }
            }
            if(count>=n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1},1));
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1},2));
        System.out.println(canPlaceFlowers(new int[]{0,0,1,0,1},1));*/
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1,0,0},3));
    }
}
