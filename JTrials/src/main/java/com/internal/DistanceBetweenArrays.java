package com.internal;

import java.util.Arrays;

public class DistanceBetweenArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int distance = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0;i<arr1.length;i++){
            boolean isWithinDist = true;

            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j]) > d){

                }else{
                    isWithinDist = false;
                    break;
                }
            }
            if(isWithinDist)
                distance++;
        }
        return distance;
    }

    public static void main(String[] args) {
        System.out.println(new DistanceBetweenArrays().findTheDistanceValue(new int[]{4,5,8},new int[]{10,9,1,8},2));
        System.out.println(new DistanceBetweenArrays().findTheDistanceValue(new int[]{1,4,2,3},new int[]{-4,-3,6,10,20,30},3));
        System.out.println(new DistanceBetweenArrays().findTheDistanceValue(new int[]{2,1,100,3},new int[]{-5,-2,10,-3,7},6));
    }
}
