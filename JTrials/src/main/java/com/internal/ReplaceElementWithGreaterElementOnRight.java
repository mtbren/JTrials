package com.internal;

import java.util.Arrays;

public class ReplaceElementWithGreaterElementOnRight {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1)
            return new int[]{-1};

        int[] retArr = new int[arr.length];
        retArr[arr.length - 1] = -1;
        int greatestElementOnRight = arr[arr.length-1];
        int index = arr.length-2;
        while(index >= 0){
            if(arr[index+1]>greatestElementOnRight)
                greatestElementOnRight = arr[index+1];
            retArr[index] = greatestElementOnRight;
            index --;
        }
        return retArr;
    }

    public static void main(String[] args) {
        //Arrays.stream(new ReplaceElementWithGreaterElementOnRight().replaceElements(new int[]{17, 18, 5, 4, 6, 1})).forEach(System.out::println);
        Arrays.stream(new ReplaceElementWithGreaterElementOnRight().replaceElements(new int[]{400})).forEach(System.out::println);
    }
}
