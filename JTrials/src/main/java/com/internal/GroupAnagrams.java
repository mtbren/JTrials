package com.internal;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class GroupAnagrams {

    public List<List<String>> groupAnagramsEfficient(String[] strs) {
        Map<String, List<String>> groupMap = new ConcurrentHashMap<String, List<String>>();
        List<List<String>> finalList = new ArrayList<>();
        for(String string : strs){
            char[] sortedStrArr = string.toCharArray();
            Arrays.sort(sortedStrArr);
            String sortedString = String.valueOf(sortedStrArr);
            if(groupMap.containsKey(sortedString)){
                groupMap.get(sortedString).add(string);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(string);
                groupMap.put(sortedString,newList);
            }
        }
        for(String key : groupMap.keySet()){
            finalList.add(groupMap.get(key));
        }
        return finalList;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupMap = new ConcurrentHashMap<String, List<String>>();
        List<List<String>> finalList = new ArrayList<>();
        for(String string : strs){
            boolean foundAMatchingKey = false;
            if(groupMap.isEmpty()) {
                List<String> newList = new ArrayList<>();
                newList.add(string);
                groupMap.put(string, newList);
                continue;
            }
            for(String key : groupMap.keySet()){

                if(stringsMatch(key,string)){
                    groupMap.get(key).add(string);
                    foundAMatchingKey = true;
                    break;
                }
            }
            if(!foundAMatchingKey){
                // create a new key
                List<String> newList = new ArrayList<>();
                newList.add(string);
                groupMap.put(string,newList);
            }
        }

        for(String key : groupMap.keySet()){
            finalList.add(groupMap.get(key));
        }
        return finalList;
    }

    private boolean stringsMatch(String a, String b){
        if(a.length() != b.length())
            return false;
        Map<Character, Integer> strA = new HashMap<>();
        Map<Character, Integer> strB = new HashMap<>();
        for(int i=0;i<a.length();i++){
            if(strA.containsKey(a.charAt(i)))
                strA.put(a.charAt(i),strA.get(a.charAt(i))+1);
            else
                strA.put(a.charAt(i),1);

            if(strB.containsKey(b.charAt(i)))
                strB.put(b.charAt(i),strB.get(b.charAt(i))+1);
            else
                strB.put(b.charAt(i),1);
        }

        for(Character key : strA.keySet()){
            if(strA.get(key)!=strB.get(key))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new GroupAnagrams().groupAnagramsEfficient(new String[]{"eat","tea","tan","ate","nat","bat"}));
        System.out.println(new GroupAnagrams().groupAnagramsEfficient(new String[]{"a"}));
        System.out.println(new GroupAnagrams().groupAnagramsEfficient(new String[]{""}));
        System.out.println(new GroupAnagrams().groupAnagramsEfficient(new String[]{"ac","c"}));
    }
}
