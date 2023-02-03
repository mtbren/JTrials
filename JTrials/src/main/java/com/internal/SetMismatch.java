package com.internal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> uniq = new HashSet<>();
        Arrays.stream(nums).forEach(i -> uniq.add(i));

        int missing = Integer.MIN_VALUE;
        int duplicate = Integer.MIN_VALUE;
        for(int i=1;i<=nums.length;i++){
            if(duplicate<0 && nums[i-1]==nums[i]){
                duplicate = nums[i];
            }
            if(!uniq.contains(i)){
                missing = i;
            }
        }
        int[] returnArr = new int[]{duplicate,missing};
        return returnArr;
    }

    public static void main(String[] args) {
        //int[] retArr = findErrorNums(new int[]{1,2,2,4});
        //int[] retArr = findErrorNums(new int[]{1,1});
        //int[] retArr = findErrorNums(new int[]{3,2,3,4,6,5});
        int[] retArr = findErrorNums(new int[]{1,5,3,2,2,7,6,4,8,9});
        Arrays.stream(retArr).forEach(i -> System.out.print(i+" "));
    }
}
