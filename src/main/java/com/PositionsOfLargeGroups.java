package com;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {
    public static List<List<Integer>> largeGroupPositions(String s) {
        int beginCounter = 0, endCounter = 0;
        List<List<Integer>> outerList = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int j = i+1;
            while(j < s.length() && s.charAt(j)==s.charAt(i)){
                j++;
            }
            if(j-i>2){
                List<Integer> innerList = new ArrayList<>();
                innerList.add(i);
                innerList.add(j-1);
                outerList.add(innerList);
            }
            i = j-1;
        }
        return outerList;
    }

    public static void main(String[] args) {
        System.out.println(largeGroupPositions("abbxxxxzzy"));
        System.out.println(largeGroupPositions("abc"));
        System.out.println(largeGroupPositions("abcdddeeeeaabbbcd"));
        System.out.println(largeGroupPositions("a"));
    }
}
