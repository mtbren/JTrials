package com.internal;

import java.util.Arrays;

public class SorterSubArray {
    private static int[] sorterSubArray(int[] arr){
        int[] origArr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        int left = 0, right = arr.length-1;
        int finalLeft=-1 , finalRight=-1;
        while(left < right){
            if(arr[left] != origArr[left] && finalLeft == -1) {
                finalLeft=left;
            }else{
                left++;
            }

            if(arr[right] != origArr[right] && finalRight == -1) {
                finalRight=right;
            }else{
                right--;
            }
            if(finalLeft!=-1 && finalRight!=-1)
                break;
        }
        int[] subArr = new int[finalRight-finalLeft+1];
        for(int i=finalLeft, j=0;i<=finalRight;i++,j++)
            subArr[j] = origArr[i];

        Arrays.stream(subArr).forEach(i -> System.out.print(i+" "));
        System.out.println();
        return subArr;
    }

    public static void main(String[] args) {
        sorterSubArray(new int[] {0,2,3,1,8,6,9});
        sorterSubArray(new int[] {1,2,4,5,3,5,6,7});
        sorterSubArray(new int[] {1,3,5,2,6,4,7,8,9});
    }
}
