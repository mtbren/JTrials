package com.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> occurrenceMap = new HashMap<Integer,Integer>();
        List<Integer> returnList = new ArrayList<Integer>();
        for(int i =0;i< nums.length;i++){
            if(occurrenceMap.containsKey(nums[i])){
                occurrenceMap.put(nums[i],occurrenceMap.get(nums[i])+1);
            }else{
                occurrenceMap.putIfAbsent(nums[i],1);
            }
        }
        int thirdCount = nums.length / 3 ;
        for(int key : occurrenceMap.keySet()){
            if(occurrenceMap.get(key)>thirdCount)
                returnList.add(key);
        }
        return returnList;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));//3
        System.out.println(majorityElement(new int[]{1}));//1
        System.out.println(majorityElement(new int[]{1,2}));//1,2
        System.out.println(majorityElement(new int[]{1,2,2,2,2,2,2,2,2,2,2,2,2,2,2}));//2
    }

}
