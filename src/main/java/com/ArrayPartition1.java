package com;

import java.util.Arrays;

public class ArrayPartition1 {
    private static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int total = 0;
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            total = total + Math.min(nums[i], nums[i + 1]);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{1,4,3,2}));
        System.out.println(arrayPairSum(new int[]{6,2,6,5,1,2}));
    }
}
