package com;

public class NumberMajorityElementInSortedArray {

    public boolean isMajorityElement(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != target)
                continue;
            else {
                int j = i;
                for (; j < nums.length; j++) {
                    if (nums[j] == target)
                        continue;
                    else
                        break;
                }
                if( j-i > nums.length/2 )
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        NumberMajorityElementInSortedArray nmesa =
                new NumberMajorityElementInSortedArray();
        System.out.println(
                nmesa.isMajorityElement(new int[]{2,4,5,5,5,5,5,6,6},5));
        System.out.println(
                nmesa.isMajorityElement(new int[]{10,100,101,101},101));
        System.out.println(
                nmesa.isMajorityElement(new int[]{1,2,3,4,5},3));
    }
}
