package com;

public class PeakIndexInAMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int i = 1, j = arr.length-1;
        while(arr[i]<arr[i+1] && arr[j]<arr[j-1]) {
            i++;
            j--;
        }

        return arr[i] >= arr[j] ? i : j;
    }

    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,1,0})); //1
        System.out.println(peakIndexInMountainArray(new int[]{0,1,2,0})); //2
        System.out.println(peakIndexInMountainArray(new int[]{0,10,5,0}));//1
    }
}
