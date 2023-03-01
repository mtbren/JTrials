package com.internal;

import java.util.Arrays;
import java.util.stream.Collectors;

public class QuickSortArray {
    public int[] sortArray(int[] nums) {
        return recursiveBreakAndSort(nums, 0, nums.length-1);
    }
    private int[] recursiveBreakAndSort(int[] nums, int start, int end){
        if(end - start == 1){
            if (nums[end] < nums[start]) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
            return Arrays.copyOfRange(nums,start, end+1);
        }else if(end == start){
            return Arrays.copyOfRange(nums,start, end+1);
        }else{
            int mid = (end - start) / 2 + start;
            int[] nums1 = recursiveBreakAndSort(nums, start, mid);
            int[] nums2 = recursiveBreakAndSort(nums, mid+1, end);
            nums = merge(nums1,nums2);

        }
        return nums;

    }
    private int[] merge(int[] a, int[] b){
        int lPtr=0, rPtr=0, mergedPtr=0;
        int[] merged = new int[a.length+b.length];
        while(mergedPtr < merged.length){
            if(lPtr >= a.length){
                merged[mergedPtr++] = b[rPtr++];
            }else if(rPtr >= b.length){
                merged[mergedPtr++] = a[lPtr++];
            }else if(a[lPtr] < b[rPtr]){
                merged[mergedPtr++] = a[lPtr++];
            }else{
                merged[mergedPtr++] = b[rPtr++];
            }
        }
        return merged;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.stream(new QuickSortArray().sortArray(new int []{5,2,3,1})).mapToObj(Integer::valueOf).collect(Collectors.toList()));
        System.out.println(Arrays.stream(new QuickSortArray().sortArray(new int []{5,2,3,1,7})).mapToObj(Integer::valueOf).collect(Collectors.toList()));
        System.out.println(Arrays.stream(new QuickSortArray().sortArray(new int []{5,2,3,1,7,4})).mapToObj(Integer::valueOf).collect(Collectors.toList()));
        System.out.println(Arrays.stream(new QuickSortArray().sortArray(new int []{5,1,1,2,0,0})).mapToObj(Integer::valueOf).collect(Collectors.toList()));
    }

}
