package com.internal;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        return search(nums, 0, nums.length-1, target);
    }

    public static int search(int[] nums, int minInd, int maxInd, int target) {
        if(minInd==maxInd){
            if(nums[minInd]==target)
                return minInd;
            else
                return -1;
        }
        if(minInd==maxInd-1){
            if(nums[minInd]==target)
                return minInd;
            else if (nums[maxInd]==target)
                return maxInd;
            else
                return -1;
        }

        int mid = (minInd + maxInd) / 2;
        if (nums[mid] > target && mid != minInd) {
            return search(nums, minInd, mid, target);
        } else if (nums[mid] < target && mid != maxInd) {
            return search(nums, mid, maxInd, target);
        }else if (nums[mid] == target){
            return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search(new int[]{-1,0,3,5,9,12},2));
    }
}

