package com;

import java.util.Arrays;

public class DutchNationalFlag {
    private static int[] makeDNF(int[] arr, int pivot) {
        int leftB = 0, rightB = arr.length-1;
        int temp = 0;
        int i = 0, j = arr.length;

        //while (i < arr.length) {
        while (i <= rightB) {
            if (arr[i] < pivot) {
                temp = arr[leftB];
                arr[leftB] = arr[i];
                arr[i] = temp;
                leftB++;
                i++;
            } else if(arr[i] > pivot) {
                temp = arr[rightB];
                arr[rightB] = arr[i];
                arr[i] = temp;
                rightB--;
            } else if(arr[i] == pivot){
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,6,7,4,5,4,5,3};
        //int[] arr = new int[]{3,2,4,1,6,3,7,5};
        arr = makeDNF(arr, 4);
        printArr(arr);
    }

    private static void printArr(int[] arr){
        Arrays.stream(arr).forEach(i-> System.out.print(" "+i));
        System.out.println();
    }
}
