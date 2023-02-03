package com.internal;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        finalList.add(new ArrayList<>());
        finalList = generateSubsets(finalList, nums);
        return finalList;
    }
    private static List<List<Integer>> generateSubsets(List<List<Integer>> finalList, int[] nums){
        List<List<Integer>> currentList = new ArrayList<List<Integer>>();
        List<Integer> innerList = new ArrayList<>();
        List<List<Integer>> list2Copy = new ArrayList<List<Integer>>();

        for(int k=0;k<nums.length;k++) {
            List<Integer> tempList = new ArrayList<>();
            tempList.add(nums[k]);

            for (int i = 0; i < finalList.size(); i++) {
                if (!finalList.get(i).isEmpty()) {
                    innerList = new ArrayList<Integer>();
                    for (int j = 0; j < finalList.get(i).size(); j++) {
                        innerList.add(finalList.get(i).get(j));
                    }
                    innerList.add(nums[k]);
                }
                if(! innerList.isEmpty()) {
                    list2Copy.add(innerList);
                    innerList = new ArrayList<Integer>();
                }
            }
            finalList.add(tempList);
            finalList.addAll(list2Copy);
            list2Copy = new ArrayList<List<Integer>>();
        }
        return finalList;
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
        System.out.println(subsets(new int[]{1,2,3,4}));
        System.out.println(subsets(new int[]{1}));
    }
}
