package com.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {
    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<Integer>();
        Arrays.sort(nums);
        int i=0, p=1;
        while(i< nums.length){
            if(nums[i]==p){
                i++;
                p++;
            }else if(nums[i]<p){
                i++;
            }else if(nums[i]>p){
                disappearedNumbers.add(p);
                p++;
            }
        }
        for(;p<=nums.length;p++){
            disappearedNumbers.add(p);
        }

        return disappearedNumbers;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }
}
