package com.internal;

import java.util.*;

public class IntersectionOf2Arrays {
    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersectList = new HashSet<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int ptr1=0, ptr2=0;

        while(ptr1<nums1.length && ptr2< nums2.length) {
            if (nums1[ptr1] > nums2[ptr2]) {
                ptr2++;
            } else if (nums1[ptr1] < nums2[ptr2]) {
                ptr1++;
            } else {
                intersectList.add(nums1[ptr1]);
                ptr1++;
                ptr2++;
            }
        }
        int[] intersectArray = new int[intersectList.size()];
        Iterator iter = intersectList.iterator();
        int count=0;
        while(iter.hasNext()){
            intersectArray[count++] = (Integer)iter.next();
        }


        return intersectArray;
    }

    public static void main(String[] args) {
        intersection(new int[]{1,2,2,1},new int[]{2,2});
        intersection(new int[]{4,9,5},new int[]{9,4,9,8,4});
    }
}
