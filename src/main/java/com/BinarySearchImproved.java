package com;

public class BinarySearchImproved {
    public static int search(int[] nums, int target) {
        int pivot;
        int max = nums.length, min = 0;
        while(min<=max){
            pivot = (min+max)/2;
            if(pivot > nums.length-1)
                return -1;
            if(nums[pivot]==target){
                return pivot;
            }else if(nums[pivot]<target){
                min = pivot+1;
            }else if(nums[pivot]>target){
                max = pivot-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{2,5}, 2));//0
        System.out.println(search(new int[]{5}, 5));//0
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));//4
        System.out.println(search(new int[]{-1,0,3,5,9,12},2));//-1
        System.out.println(search(new int[]{-1,0,3,5,9,12},13));//-1
    }
}
