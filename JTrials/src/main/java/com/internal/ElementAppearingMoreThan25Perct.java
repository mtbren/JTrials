package com.internal;

public class ElementAppearingMoreThan25Perct {
    public int findSpecialInteger(int[] arr) {
        if(arr.length==1)
            return arr[0];
        int currCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currCount++;
                if(currCount > arr.length/4.0)
                    return arr[i];
            }else
                currCount = 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new ElementAppearingMoreThan25Perct().findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10}));
        System.out.println(new ElementAppearingMoreThan25Perct().findSpecialInteger(new int[]{1,1}));
        System.out.println(new ElementAppearingMoreThan25Perct().findSpecialInteger(new int[]{1}));
    }
}
