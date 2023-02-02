package com;

import java.util.Arrays;

public class DistributeCandies {
    private static int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int maxDiffTypeOfCandiesAliceCanEat = 1;

        for(int i=1;i<candyType.length;i++){
            if(maxDiffTypeOfCandiesAliceCanEat>=candyType.length/2)
                break;
            if(candyType[i]==candyType[i-1]){
                continue;
            }else{
                maxDiffTypeOfCandiesAliceCanEat++;
            }
        }
        return maxDiffTypeOfCandiesAliceCanEat;
    }

    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1,1,2,2,3,3}));
        System.out.println(distributeCandies(new int[]{1,1,2,3}));
        System.out.println(distributeCandies(new int[]{6,6,6,6}));
    }
}
