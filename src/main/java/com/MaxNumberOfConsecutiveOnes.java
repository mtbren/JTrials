package com;

public class MaxNumberOfConsecutiveOnes {
    private static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
            } else {
                if (temp > maxConsecutiveOnes) {
                    maxConsecutiveOnes = temp;
                }
                temp = 0;
            }
        }
        return maxConsecutiveOnes > temp ? maxConsecutiveOnes : temp;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }
}
