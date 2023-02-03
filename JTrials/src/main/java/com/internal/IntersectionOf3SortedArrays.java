package com.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOf3SortedArrays {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> intersection12 = arraysIntersection(arr1, arr2);
        List<Integer> intersection23 = arraysIntersection(arr2, arr3);

        return intersection12
                .stream()
                .filter(number -> intersection23.contains(number))
                .collect(Collectors.toList());
    }
    private List<Integer> arraysIntersection(int[] arr1, int[] arr2){
         List<Integer> intersection = new ArrayList<>();
         int lptr = 0, rptr = 0;
         while(lptr < arr1.length && rptr < arr2.length){
             if(arr1[lptr]==arr2[rptr]) {
                 intersection.add(arr1[lptr]);
                 lptr++;
                 rptr++;
             }else if(arr1[lptr]<arr2[rptr]){
                 lptr++;
             }else if(arr1[lptr]>arr2[rptr]){
                 rptr++;
             }
         }
         return intersection;
    }

    public static void main(String[] args) {
        List<Integer> intersection = new IntersectionOf3SortedArrays().arraysIntersection(
                new int[]{1,2,3,4,5},new int[]{1,2,5,7,9},new int[]{1,3,4,5,8}
        );
        System.out.println();

        intersection = new IntersectionOf3SortedArrays().arraysIntersection(
                new int[]{197,418,523,876,1356},new int[]{501,880,1593,1710,1870},
                new int[]{521,682,1337,1395,1764}
        );
        System.out.println();
    }
}
