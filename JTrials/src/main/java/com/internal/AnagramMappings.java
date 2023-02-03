package com.internal;

import java.util.HashMap;
import java.util.Map;

public class AnagramMappings {
    public static int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] output = new int[nums1.length];
        for(int i=0; i< nums2.length;i++){
            map.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++){
            output[i]=map.get(nums1[i]);
        }
        return output;
    }

    public static void main(String[] args) {
        anagramMappings(new int[]{12,28,46,32,50},new int[]{50,12,32,46,28});
        anagramMappings(new int[]{84,46},new int[]{84,46});
    }
}
