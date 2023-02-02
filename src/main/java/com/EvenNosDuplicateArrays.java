package com;

import java.util.Arrays;

public class EvenNosDuplicateArrays {
    private static void duplicateEvenNos(int[] arr){
        int right = arr.length-1;
        int left;
        for(left=right;arr[left]==-1;left--);

        while(right>left && left>=0){
            if(arr[left]%2==0){
                arr[right]=arr[left];
                right--;
                arr[right]=arr[left];
                right--;
            }else{
                arr[right]=arr[left];
                right--;
            }
            left--;
        }
        Arrays.stream(arr).forEach(i-> System.out.print(i+" "));
    }

    public static void main(String[] args) {
        duplicateEvenNos(new int[]{1,2,4,3,-1,-1});
    }
}
