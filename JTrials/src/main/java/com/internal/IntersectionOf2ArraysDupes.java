package com.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOf2ArraysDupes {
    private static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> intersection = new ArrayList<Integer>();
        int p1=0, p2=0;
        while(p1< nums1.length && p2< nums2.length){
            if(nums1[p1]==nums2[p2]){
                intersection.add(nums1[p1]);
                p1++;
                p2++;
            }else if(nums1[p1]>nums2[p2]){
                p2++;
            }else if(nums1[p1]<nums2[p2]){
                p1++;
            }
        }
        int [] interArr = new int[intersection.size()];
        for(int i=0;i<intersection.size();i++){
            interArr[i]=intersection.get(i);
        }
        return interArr;
    }

    public static void main(String[] args) {
        intersect(new int[]{1,2,2,1},new int[]{2,2});
        intersect(new int[]{4,9,5},new int[]{9,4,9,8,4});
    }
}
