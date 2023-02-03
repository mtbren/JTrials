package com.internal;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int leftPtr=0;
        int rightPtr= nums.length-1;
        while(true){
            if(nums[leftPtr]%2!=0 && nums[rightPtr]%2==0){
                int temp = nums[leftPtr];
                nums[leftPtr] = nums[rightPtr];
                nums[rightPtr] = temp;
            }
            if(nums[rightPtr]%2!=0)
                rightPtr--;
            if(nums[leftPtr]%2==0)
                leftPtr++;

            if(leftPtr>=rightPtr)
                break;
        }
        return nums;
    }
    public int[] sortArrayByParity2(int[] nums) {
        int[] nums2 = new int[nums.length];
        int leftPtr = 0;
        int rightPtr = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums2[leftPtr]=nums[i];
                leftPtr++;
            }else if(nums[i]%2!=0){
                nums2[rightPtr]=nums[i];
                rightPtr--;
            }
        }
        return nums2;
    }

    public static void main(String[] args) {
        System.out.println(new SortArrayByParity().sortArrayByParity(
                new int[]{0,2,1,4}));
        System.out.println(new SortArrayByParity().sortArrayByParity(
                new int[]{0,2,1}));
        System.out.println(new SortArrayByParity().sortArrayByParity(
                new int[]{0,1,2}));
        System.out.println(new SortArrayByParity().sortArrayByParity(
                new int[]{6,5,4,3,2,1}));
        System.out.println(new SortArrayByParity().sortArrayByParity(
                new int[]{1}));
        System.out.println(new SortArrayByParity().sortArrayByParity(
                new int[]{1,1,1,1,1}));
        System.out.println(new SortArrayByParity().sortArrayByParity(
                new int[]{2}));
        System.out.println(new SortArrayByParity().sortArrayByParity(
                new int[]{2,2,2,2,2}));
        System.out.println(new SortArrayByParity().sortArrayByParity(
                new int[]{0}));
        System.out.println(new SortArrayByParity().sortArrayByParity(
                new int[]{1,2,2,2,2}));
        System.out.println(new SortArrayByParity().sortArrayByParity(
                new int[]{1,3,2,4}));
    }
}
