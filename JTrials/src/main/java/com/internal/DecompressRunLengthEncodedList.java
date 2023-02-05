package com.internal;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int resultArrLength = 0;
        for (int i = 0; i < nums.length; i += 2) {
            resultArrLength += nums[i];
        }
        int[] resultArr = new int[resultArrLength];

        int resultArrPtr = 0;
        for (int i = 0; i < nums.length; i += 2) {
            for(int j=0;j<nums[i];j++){
                resultArr[resultArrPtr++] = nums[i+1];
            }
        }
        return resultArr;
    }

}
