package com.internal;

import java.util.Arrays;

public class MoveZeroes {
    private static void moveZeroes(int[] nums) {
        int countZero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countZero++;
            }else{
                nums[i-countZero]=nums[i];
            }
        }
        for(int i=nums.length-1;i>=0 && countZero>0;i--){
            nums[i]=0;
            countZero--;
        }
        Arrays.stream(nums).forEach(i -> System.out.print(i+" "));
        System.out.println();
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,2});
        moveZeroes(new int[]{0});
        moveZeroes(new int[]{1});
        moveZeroes(new int[]{1,0});
        moveZeroes(new int[]{0,1});
        moveZeroes(new int[]{});
    }

}
