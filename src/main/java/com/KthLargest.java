package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KthLargest {
    int k;
    int[] largest ;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        largest = new int[k];
        Arrays.sort(nums);
        for(int i=nums.length-1,j=k-1;j>=0;i--,j--){
            largest[j]=nums[i];
        }
    }

    public int add(int val) {
        if(val<largest[0]) {
            return largest[0];
        }else{
            int pos;
            for(pos=0;pos<k-1;pos++){
                if (val>largest[pos]) {
                    largest[pos]=largest[pos+1];
                }else
                    break;
            }
            largest[pos]=val;

            return largest[0];
        }
    }

    public static void main(String[] args) {
        KthLargest kth = new KthLargest(3,new int[]{4,5,8,2});
        System.out.println(kth.add(3));//4
        System.out.println(kth.add(5));//5
        System.out.println(kth.add(10));//5
        System.out.println(kth.add(9));//8
        System.out.println(kth.add(4));//8
    }
}
