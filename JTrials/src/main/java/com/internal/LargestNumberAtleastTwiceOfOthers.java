package com.internal;

import java.util.Arrays;

public class LargestNumberAtleastTwiceOfOthers {
    public static int dominantIndex(int[] nums) {
        if(nums.length<2)
            return 0;
        int[] numsSorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsSorted);

        if(numsSorted[numsSorted.length-1]>=2*numsSorted[numsSorted.length-2]){
            for(int i=0;i< nums.length;i++){
                if(nums[i]==numsSorted[numsSorted.length-1])
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[] {3,6,1,0})); //1
        System.out.println(dominantIndex(new int[] {1,2,3,4})); //-1
        System.out.println(dominantIndex(new int[] {1}));

    }
}
