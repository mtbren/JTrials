package com.internal;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public static int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map1 = new HashMap<String, Integer>();
        Map<String,Integer> map2 = new HashMap<String, Integer>();

        for(int i=0;i<words1.length;i++){
            if(map1.containsKey(words1[i])){
                map1.put(words1[i],map1.get(words1[i])+1);
            }else{
                map1.put(words1[i],1);
            }
        }
        for(int i=0;i<words2.length;i++){
            if(map2.containsKey(words2[i])){
                map2.put(words2[i],map2.get(words2[i])+1);
            }else{
                map2.put(words2[i],1);
            }
        }
        int finalCount = 0;
        for(String key : map1.keySet()){
            if(map1.get(key)==1 && map2.get(key) != null && map2.get(key)==1)
                finalCount++;
        }
        return finalCount;
    }

    public static void main(String[] args) {
        System.out.println(countWords(new String[]{"leetcode","is","amazing","as","is"},
                new String[]{"amazing","leetcode","is"}));//2
        System.out.println(countWords(new String[]{"b","bb","bbb"},
                new String[]{"a","aa","aaa"}));//0
        System.out.println(countWords(new String[]{"a","ab"},
                new String[]{"a","a","a","ab"}));//1
    }
}
