package com.internal;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();

        /*
        System.out.println(searchInRotatedSortedArray.findPivot(new int[]{5,1,3}));//1
        System.out.println(searchInRotatedSortedArray.findPivot(new int[]{4,5,6,7,0,1,2}));//4
        System.out.println(searchInRotatedSortedArray.findPivot(new int[]{7,8,1,2,3,4,5,6}));//2
        System.out.println(searchInRotatedSortedArray.findPivot(new int[]{3,4,5,6,7,8,1,2}));//6
        */


        System.out.println(searchInRotatedSortedArray.search(new int[]{7,8,1,2,3,4,5,6},2));//3
        System.out.println(searchInRotatedSortedArray.search(new int[]{5,1,3},1));//1
        System.out.println(searchInRotatedSortedArray.search(new int[]{1,3},4));//-1
        System.out.println(searchInRotatedSortedArray.search(new int[]{1,3},0));//-1
        System.out.println(searchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2},1));//5
        System.out.println(searchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2},0));//4
        System.out.println(searchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2},7));//3
        System.out.println(searchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2},4));//0
        System.out.println(searchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2},3));//-1
        System.out.println(searchInRotatedSortedArray.search(new int[]{1},0));//-1
        System.out.println(searchInRotatedSortedArray.search(new int[]{1},1));//0


    }
    public int search(int[] nums, int target) {
        boolean rotated = false;
        if(nums.length==1){
            return nums[0]==target ? 0:-1;
        }
        if(nums[nums.length-1] < nums[0]) {
            rotated = true;
            if (target > nums[nums.length - 1] && target < nums[0])
                return -1;
        }
        int pivot = -1;
        if(rotated)
            pivot = findPivot(nums);

        if(rotated) {
            if (nums[pivot] == target)
                return pivot;
            if (nums[pivot] <= target && nums[nums.length - 1] >= target) {
                return findInt(nums, pivot, nums.length-1, target);
            } else if (nums[pivot - 1] >= target && nums[0] <= target) {
                return findInt(nums, 0, pivot - 1, target);
            } else {
                return -1;
            }
        }else{
            return findInt(nums,0, nums.length-1, target);
        }
    }

    private int findInt(int[] nums, int left, int right, int target){
        if(left == right || left == right-1){
            if(nums[left] == target) {
                return left;
            }else if (nums[right] == target){
                return right;
            }else{
                return -1;
            }
        }else{
            int mid = (left + right)/2;
            if(target>nums[mid]){
                left = mid;
            }else if (target<nums[mid]){
                right = mid;
            }else if (target == nums[mid]){
                return mid;
            }
            return findInt(nums, left, right, target);
        }
    }

    private int findPivot(int[] nums){
        //System.out.println(searchInRotatedSortedArray.findPivot(new int[]{5,1,3}));
        //System.out.println(searchInRotatedSortedArray.findPivot(new int[]{4,5,6,7,0,1,2}));
        //System.out.println(searchInRotatedSortedArray.findPivot(new int[]{7,8,1,2,3,4,5,6}));
        //System.out.println(searchInRotatedSortedArray.findPivot(new int[]{3,4,5,6,7,8,1,2}));
        int left = 0;

        while(left < nums.length-1 && nums[left+1] > nums[left])
            left++;
        return left+1;
    }
}
