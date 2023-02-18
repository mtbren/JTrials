package com.internal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class TargetArrayInGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> llist = new ArrayList<>();

        for (int i = 0; i < index.length; i++){
            llist.add(index[i],nums[i]);
        }

        return llist.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new TargetArrayInGivenOrder().createTargetArray(new int[] {0,1,2,3,4}, new int[] {0,1,2,2,1}));
    }
}
