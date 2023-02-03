package com.internal;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    private static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        if (nums[0] > -1) {
            return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        } else {
            if (nums[nums.length - 1] > -1) {
                if (nums[0] * nums[1] > nums[nums.length - 2] * nums[nums.length - 3]) {
                    return nums[0] * nums[1] * nums[nums.length - 1];
                }
            }
            return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        }
    }

    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{1, 2, 3}));
        System.out.println(maximumProduct(new int[]{1, 2, 3, 4}));
        System.out.println(maximumProduct(new int[]{-1, -2, -3}));
        System.out.println(maximumProduct(new int[]{-100, -98, -1, 2, 3, 4})); //39200
        System.out.println(maximumProduct(new int[]{-1, -2, -3, -4})); //-6
    }

}
