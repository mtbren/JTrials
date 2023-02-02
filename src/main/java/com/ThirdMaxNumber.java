package com;

import java.util.Arrays;

public class ThirdMaxNumber {
    private static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int lastMax = nums[nums.length-1];
        int countChanged = 1;


        for(int i=nums.length-1;i>=0;i--){
            if(lastMax > nums[i]){
                lastMax = nums[i];
                countChanged ++;
            }
            if(countChanged==3)
                break;
        }

        if(countChanged<3)
            return nums[nums.length-1];
        else
            return lastMax;
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,1,1,2,2,3,3,4,5,6}));
    }
}
