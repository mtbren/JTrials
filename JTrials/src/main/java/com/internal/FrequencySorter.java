package com.internal;

import java.util.*;

public class FrequencySorter {
    public String frequencySort(String s) {
        Map<Character, Integer> freqMap =
                new HashMap<Character, Integer>();
        Map<Integer, Set<Character>> freqMapReverse =
                new HashMap<Integer, Set<Character>>();
        StringBuffer sBuf = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if (freqMap.keySet().contains(s.charAt(i))) {
                freqMap.put(s.charAt(i), freqMap.get(s.charAt(i)) + 1);
                if(freqMapReverse.get(freqMap.get(s.charAt(i))-1) != null) {
                    freqMapReverse.get(freqMap.get(s.charAt(i))-1).remove(s.charAt(i));
                }
                if(freqMapReverse.get(freqMap.get(s.charAt(i))) != null){
                    freqMapReverse.get(freqMap.get(s.charAt(i))).add(s.charAt(i));
                }else{
                    Set<Character> setToAdd = new HashSet<Character>();
                    setToAdd.add(s.charAt(i));
                    freqMapReverse.put(freqMap.get(s.charAt(i)), setToAdd);
                }
            }else {
                freqMap.put(s.charAt(i), 1);
                if(freqMapReverse.get(freqMap.get(s.charAt(i))) != null) {
                    freqMapReverse.get(freqMap.get(s.charAt(i))).add(s.charAt(i));
                }else{
                    Set<Character> setToAdd = new HashSet<Character>();
                    setToAdd.add(s.charAt(i));
                    freqMapReverse.put(freqMap.get(s.charAt(i)), setToAdd);
                }
            }
        }
        freqMapReverse.keySet().forEach(key -> {
            freqMapReverse.get(key).forEach(setVal -> {
                for(int i=0;i<key;i++) {
                    sBuf.append(setVal);
                }
            });
        });
        return sBuf.reverse().toString();
    }

    public static void main(String[] args) {
        FrequencySorter fs = new FrequencySorter();
        System.out.println(fs.frequencySort("aabbbcccc"));
        System.out.println(fs.frequencySort("ccccbbbaa"));
        System.out.println(fs.frequencySort("tree"));
        System.out.println(fs.frequencySort("ccaa"));
        System.out.println(fs.frequencySort("Aabb"));

    }
}
