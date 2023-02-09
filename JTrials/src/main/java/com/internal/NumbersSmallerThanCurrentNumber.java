package com.internal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NumbersSmallerThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] numsSmaller = new int[nums.length];
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Map<Integer,Integer> posMap = new TreeMap<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            posMap.putIfAbsent(nums[i],i);
        }
        int ptr = 0;
        for(int num : numsCopy){
            numsSmaller[ptr++] = posMap.get(num);
        }
        return numsSmaller;
    }

    public static void main(String[] args) {
        new NumbersSmallerThanCurrentNumber().smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
    }

}
