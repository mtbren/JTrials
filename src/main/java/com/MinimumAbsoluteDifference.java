package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mad = Integer.MAX_VALUE;
        int j=0;

        for(int i=0;i<arr.length-1;i++){
            j=i+1;
            if(Math.abs(arr[i]-arr[j]) <= mad){
                mad = Math.abs(arr[i]-arr[j]);
            }
        }

        List<List<Integer>> outerList = new ArrayList<List<Integer>>();
        for(int i=0;i<arr.length-1;i++){
            j=i+1;
            if(Math.abs(arr[i]-arr[j]) == mad){
                List<Integer> innerList = new ArrayList<>();
                innerList.add(arr[i]);
                innerList.add(arr[j]);
                outerList.add(innerList);
            }
        }

        return outerList;
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifference mad = new MinimumAbsoluteDifference();
        mad.minimumAbsDifference(new int[]{4,2,1,3});
        mad.minimumAbsDifference(new int[]{1,3,6,10,15});
        mad.minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27});
    }
}
