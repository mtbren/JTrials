package com.internal;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        /*if (totalSum==0)
                return 0;*/
        rightSum = totalSum;
        for(int i=0;i<nums.length;i++){
            rightSum = rightSum-nums[i];
            if(i>0) {
                leftSum = leftSum + nums[i - 1];
            }

            if (leftSum==rightSum)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[] {1,7,3,6,5,6}));//3
        System.out.println(pivotIndex(new int[] {2,1,-1}));
        System.out.println(pivotIndex(new int[] {-1,-1,-1,1,1,1}));
        System.out.println(pivotIndex(new int[] {-1,-1,0,1,1,0}));//5
    }
}
