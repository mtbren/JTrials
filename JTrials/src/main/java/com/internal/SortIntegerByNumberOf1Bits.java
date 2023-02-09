package com.internal;

import java.util.*;

public class SortIntegerByNumberOf1Bits {

    public int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> bitMap = new TreeMap<>();
        Arrays.sort(arr);

        for(int num : arr){
            String binary = Integer.toBinaryString(num);
            int count1 = 0;
            for(int j=0;j<binary.length();j++){
                if(binary.charAt(j)=='1')
                    count1++;
            }
            if(bitMap.containsKey(count1)){
                bitMap.get(count1).add(num);
            }else{
                bitMap.put(count1, new ArrayList<Integer>());
                bitMap.get(count1).add(num);
            }
        }

        int[] retArr = new int[arr.length];
        int ptr = 0;
        for(int key : bitMap.keySet()){
            for(int val : bitMap.get(key)){
                retArr[ptr++] = val;
            }
        }
        return retArr;
    }
}
