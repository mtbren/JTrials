package com.internal;

import java.util.*;
import java.util.stream.Collectors;

public class IndexPairsOfString {
    public int[][] indexPairs(String text, String[] words) {
        Map<Integer, LinkedList<Integer>> myMap =
                new HashMap<Integer, LinkedList<Integer>>();
        int[][] retArr ;
        int sizeArr = 0;
        for(String word : words){
            if (text.contains(word)){
                int start = text.indexOf(word);
                int end = text.lastIndexOf(word);
                while(start <= end) {
                    int currIndex = text.indexOf(word, start);

                    if(myMap.containsKey(currIndex)){
                        myMap.get(currIndex)
                                .add(currIndex+word.length()-1);
                        sizeArr ++;
                    }else{
                        myMap.put(currIndex, new LinkedList<Integer>());
                        myMap.get(currIndex)
                                .add(currIndex+word.length()-1);
                        sizeArr ++;
                    }
                    start = text.indexOf(word, start+1);
                    if(start < 0)
                        break;
                }
            }
        };
        retArr = new int[sizeArr][2];
        int count = 0;

        List<Integer> mapList = myMap.keySet().stream().sorted().collect(Collectors.toList());

        for(int keyM : mapList){

            for(int keyS : myMap.get(keyM).stream().sorted().collect(Collectors.toList())){
                retArr[count][0]=keyM;
                retArr[count][1]=keyS;
                count++;
            }
        }

        return retArr;
    }

    public static void main(String[] args) {
        IndexPairsOfString ips = new IndexPairsOfString();
        ips.indexPairs("aaabaabababbaaabaabaaababaaaab",
                new String[]{"abb","baba","aababb","baaaaa","aabba"});
        /*ips.indexPairs("ababa",
                new String[]{"aba","ab"});*/
    }
}
