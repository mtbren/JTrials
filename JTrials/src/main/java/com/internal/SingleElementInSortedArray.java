package com.internal;

public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)
            return nums[0];
        return singleNonDupeRecursive(nums, 0, nums.length);
    }

    private int singleNonDupeRecursive(int[] nums, int start, int end) {

        if(end-start <= 3){
            if(end-start == 0)
                return nums[start];
            else{
                if(nums[start] == nums[start+1])
                    return nums[end-1];
                else
                    return nums[start];
            }
        }
        int mid = (end + start) / 2;
        if (mid % 2 != 0) {
            if (nums[mid] == nums[mid + 1]) {
                //search left
                return singleNonDupeRecursive(nums, start, mid + 1);
            } else if (nums[mid] == nums[mid - 1]) {
                //search right
                return singleNonDupeRecursive(nums, mid - 1, end);
            } else {
                return nums[mid];
            }
        } else {
            if (nums[mid] == nums[mid + 1]) {
                //search right
                return singleNonDupeRecursive(nums, mid, end);
            } else if (nums[mid] == nums[mid - 1]) {
                //search left
                return singleNonDupeRecursive(nums, start, mid);
            } else {
                return nums[mid];
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(new SingleElementInSortedArray().singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
        System.out.println(new SingleElementInSortedArray().singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8,9,9,10,10}));
        System.out.println(new SingleElementInSortedArray().singleNonDuplicate(new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 8, 8, 9, 9, 10, 10}));
        System.out.println(new SingleElementInSortedArray().singleNonDuplicate(new int[]{2, 3, 3, 4, 4, 8, 8, 9, 9, 10, 10}));
        System.out.println(new SingleElementInSortedArray().singleNonDuplicate(new int[] {0,0,1,1,2}));
    }
}

