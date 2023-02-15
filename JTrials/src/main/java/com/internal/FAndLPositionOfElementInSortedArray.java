package com.internal;

public class FAndLPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
            return new int[]{-1,-1};
        int leftMostPos = leftIndex(nums, target, 0, nums.length-1, true);
        int rightmostPos = leftIndex(nums, target, 0, nums.length-1, false);

        System.out.println(leftMostPos+" "+rightmostPos);
        return new int[]{leftMostPos, rightmostPos};
    }

    public int leftIndex(int[] nums, int target, int leftSearchPos, int rightSearchPos, boolean searchLeft) {
        if(leftSearchPos == rightSearchPos-1 || leftSearchPos==rightSearchPos){
            if(nums[leftSearchPos] != target && nums[rightSearchPos] != target)
                return -1;
            if(searchLeft){
                if(nums[leftSearchPos] == target )
                    return leftSearchPos;
                else if(nums[rightSearchPos] == target)
                    return rightSearchPos;
            }else{
                if(nums[rightSearchPos] == target)
                    return rightSearchPos;
                else if(nums[leftSearchPos] == target )
                    return leftSearchPos;
            }

            if(nums[leftSearchPos] == target )
                return leftSearchPos;
            if(nums[rightSearchPos] == target)
                return rightSearchPos;
        }
        int midSearchPos = (leftSearchPos + rightSearchPos) / 2;
        if (nums[midSearchPos] < target) {
            return leftIndex(nums, target, midSearchPos, rightSearchPos, searchLeft);
        } else if (nums[midSearchPos] > target) {
            return leftIndex(nums, target, leftSearchPos, midSearchPos, searchLeft);
        } else {
            if (midSearchPos == 0 && searchLeft)
                return 0;
            if( midSearchPos == nums.length-1 && !searchLeft)
                return nums.length-1;
            if (searchLeft && nums[midSearchPos - 1] < nums[midSearchPos] ) {
                return midSearchPos;
            }else if(!searchLeft && nums[midSearchPos+1] > nums[midSearchPos]){
                return midSearchPos;
            }else {
                if(searchLeft)
                    return leftIndex(nums, target, leftSearchPos, midSearchPos, searchLeft);
                else
                    return leftIndex(nums, target, midSearchPos, rightSearchPos, searchLeft);
            }
        }
    }

    public static void main(String[] args) {
        new FAndLPositionOfElementInSortedArray().searchRange(new int[]{1, 2, 3, 4, 5, 6}, 5); // 4
        new FAndLPositionOfElementInSortedArray().searchRange(new int[]{1, 2, 3, 4, 5, 6}, 2); // 1
        new FAndLPositionOfElementInSortedArray().searchRange(new int[]{1, 2, 3, 4, 5, 6}, 1); // 0
        new FAndLPositionOfElementInSortedArray().searchRange(new int[]{1, 5, 5, 5, 5, 6}, 5); // 1
        new FAndLPositionOfElementInSortedArray().searchRange(new int[]{1, 5, 5, 5, 5, 6}, 3); // -1
        new FAndLPositionOfElementInSortedArray().searchRange(new int[]{1, 5, 5, 5, 5, 6}, 9); // -1
        new FAndLPositionOfElementInSortedArray().searchRange(new int[]{1, 5, 5, 5, 5, 6}, 0); // -1
        new FAndLPositionOfElementInSortedArray().searchRange(new int[]{1}, 0); // -1,-1
        new FAndLPositionOfElementInSortedArray().searchRange(new int[]{2,2}, 2); // [0,1]
        new FAndLPositionOfElementInSortedArray().searchRange(new int[]{1,4}, 4); // [1,1]
    }

}
