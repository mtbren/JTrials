package com.internal;

public class MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {
        int minSumVal = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(minSumVal > sum)
                minSumVal = sum;
        }
        return minSumVal > 0 ? 1 : -minSumVal+1;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumValueToGetPositiveStepByStepSum().minStartValue(new int[]{-3,2,-3,4,2}));
        System.out.println(new MinimumValueToGetPositiveStepByStepSum().minStartValue(new int[]{1,2}));
        System.out.println(new MinimumValueToGetPositiveStepByStepSum().minStartValue(new int[]{1,-2,-3}));
    }
}
