package com.internal;

import java.util.*;

public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> s1Map = new HashMap<String, Integer>();
        Map<String, Integer> s2Map = new HashMap<String, Integer>();

        StringTokenizer strtkn1 = new StringTokenizer(s1," ");
        StringTokenizer strtkn2 = new StringTokenizer(s2," ");

        while(strtkn1.hasMoreTokens()){
            String s = strtkn1.nextToken();
            if(s1Map.containsKey(s))
                s1Map.put(s,s1Map.get(s)+1);
            else
                s1Map.put(s,1);
        }
        while(strtkn2.hasMoreTokens()){
            String s = strtkn2.nextToken();
            if(s2Map.containsKey(s))
                s2Map.put(s,s2Map.get(s)+1);
            else
                s2Map.put(s,1);
        }
        int counter=0;

        Set<String> mySet = new HashSet<String>();

        for(String key : s1Map.keySet()){
            if(s1Map.get(key)>1 || s2Map.containsKey(key)) {

            }else{
                mySet.add(key);
                //arr[counter++]=key;
            }
        }
        for(String key : s2Map.keySet()){
            if(s2Map.get(key)>1 || s1Map.containsKey(key)) {
                //s2Map.remove(key);
            }else{
                //arr[counter++]=key;
                mySet.add(key);
            }
        }
        String[] arr = new String[mySet.size()];


        for(String elem : mySet){
            arr[counter++]=elem;
        }
        return arr;
    }

    public static void main(String[] args) {
        new UncommonWordsFromTwoSentences().uncommonFromSentences(
                "this apple is sweet","this apple is sour");
        new UncommonWordsFromTwoSentences().uncommonFromSentences(
                "apple apple","banana");
    }
}
