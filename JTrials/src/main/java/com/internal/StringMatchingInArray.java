package com.internal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatchingInArray {
    public List<String> stringMatching(String[] words) {

        List<String> finalList = new ArrayList<>();
        Set<Integer> indexSet = new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j< words.length;j++){
                if(i==j)
                    continue;
                if(indexSet.contains(j) || indexSet.contains(i))
                    continue;
                if(words[i].contains(words[j])) {
                    finalList.add(words[j]);
                    indexSet.add(j);
                }
            }
        }
        return finalList;
    }

    public static void main(String[] args) {
        /*System.out.println(new StringMatchingInArray().stringMatching(new String[]{"mass","as","hero","superhero"}));
        System.out.println(new StringMatchingInArray().stringMatching(new String[]{"leetcode","et","code"}));*/
        System.out.println(new StringMatchingInArray().stringMatching(new String[]{"leetcoder","leetcode","od","hamlet","am"}));

    }
}
