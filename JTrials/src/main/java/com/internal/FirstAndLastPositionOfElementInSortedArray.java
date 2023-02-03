package com.internal;

public class FirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
            return new int[]{-1, -1};

        int beginIndex = search(nums, 0, nums.length-1, target, true);
        int endIndex = search(nums, 0, nums.length-1, target, false);
        return new int[]{beginIndex, endIndex};
    }

    private int search(int[] nums, int beginIndex, int endIndex, int target, boolean searchBeginning){
        if(searchBeginning && nums[beginIndex] > target)
            return -1;
        if(searchBeginning && nums[endIndex] < target)
            return -1;
        if(!searchBeginning && nums[endIndex] < target)
            return -1;
        if(!searchBeginning && nums[beginIndex] > target)
            return -1;
        if(endIndex - beginIndex < 3){
            if(searchBeginning) {
                for (int i = beginIndex; i <= endIndex; i++) {
                    if (nums[i]==target)
                        return i;
                }
            }else{
                for (int i = endIndex; i >=beginIndex ; i--) {
                    if (nums[i]==target)
                        return i;
                }
            }
        }

        if(searchBeginning){
            if(nums[beginIndex]==target)
                return beginIndex;
        }else{
            if(nums[endIndex]==target)
                return endIndex;
        }
        int mid = (beginIndex + endIndex) / 2 ;
        if(nums[mid] == target){
            if(searchBeginning)
                return search(nums,beginIndex,mid,target,searchBeginning);
            else
                return search(nums,mid,endIndex,target,searchBeginning);
        }else{
            if(nums[mid] < target) {
                if (searchBeginning)
                    return search(nums, mid, endIndex, target, searchBeginning);
                else
                    return search(nums, beginIndex, mid, target, searchBeginning);
            }else{
                if (searchBeginning)
                    return search(nums, beginIndex, mid, target, searchBeginning);
                else
                    return search(nums, mid, endIndex, target, searchBeginning);
            }
        }
        //return -1;
    }

    public static void main(String[] args) {
        FirstAndLastPositionOfElementInSortedArray falp =
                new FirstAndLastPositionOfElementInSortedArray();
        falp.searchRange(new int[]{1,1,2,2,2,2,3,4,5,5,5},2);
        falp.searchRange(new int[]{1,1,2,3,3,3,3,4,5,5,5},2);
    }
}
