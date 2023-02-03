package com.internal;

public class MissingNumber {
    private static int missingNumber(int[] nums) {
        int finalTally=0;
        for(int i=0;i<nums.length;i++){
            finalTally = finalTally + i;
            finalTally = finalTally - nums[i];
        }
        return finalTally+nums.length;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber(new int[]{0,1}));
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumber(new int[]{0}));
        System.out.println(missingNumber(new int[]{}));
    }
}
