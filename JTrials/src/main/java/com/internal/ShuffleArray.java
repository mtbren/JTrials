package com.internal;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] newNums = new int[2*n];
        int newPtr = 0;
        for (int i = 0, j = n; i < n && j < 2*n; i += 1, j += 1){
            newNums[newPtr++] = nums[i];
            newNums[newPtr++] = nums[j];
        }
        return newNums;
    }

    public static void main(String[] args) {
        new ShuffleArray().shuffle(new int[]{2,5,1,3,4,7}, 3);
    }
}
