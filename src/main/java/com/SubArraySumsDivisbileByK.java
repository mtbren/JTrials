package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraySumsDivisbileByK {
    public int subarraysDivByK(int[] nums, int k) {
        int subArraysDivByK = 0;
        List<int[]> subArrays = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int tempAdd = 0;
            for(int j=i;j<nums.length;j++){
                tempAdd += nums[j];
                if(tempAdd % k ==0) {
                    subArraysDivByK++;
                    subArrays.add(Arrays.copyOfRange(nums, i, j+1));
                }
            }
        }
        return subArraysDivByK;
    }

    public static void main(String[] args) {
        System.out.println(new SubArraySumsDivisbileByK().subarraysDivByK(
                new int[]{4,5,0,-2,-3,1}, 5
        ));//7
        System.out.println(new SubArraySumsDivisbileByK().subarraysDivByK(
                new int[]{5}, 9
        ));//0
        System.out.println(new SubArraySumsDivisbileByK().subarraysDivByK(
                new int[]{9}, 3
        ));//1
    }
}
