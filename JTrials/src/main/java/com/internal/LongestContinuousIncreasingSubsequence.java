package com.internal;

public class LongestContinuousIncreasingSubsequence {
    public static int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int tempMax = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                tempMax++;
            } else {
                if (tempMax > max) {
                    max = tempMax;
                }
                tempMax = 1;
            }
        }
        return max > tempMax ? max : tempMax;
    }

    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
        System.out.println(findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
    }
}
