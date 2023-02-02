package com;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> occurMap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(occurMap.containsKey(nums[i])){
                if(occurMap.get(nums[i])==2) {
                    occurMap.remove(nums[i]);
                }else{
                    occurMap.put(nums[i],occurMap.get(nums[i])+1);
                }
            }else{
                occurMap.put(nums[i],1);
            }
        }
        return (int)(occurMap.keySet().stream().toArray()[0]);
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,3,2}));
        System.out.println(singleNumber(new int[]{0,1,0,1,0,1,99}));
        System.out.println(singleNumber(new int[]{0}));
    }
}
