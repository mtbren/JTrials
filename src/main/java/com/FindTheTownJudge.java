package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindTheTownJudge {
    public static int findJudge(int n, int[][] trust) {
        if(n==1 && trust.length==0)
            return 1;
        Map<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
        for(int i=0;i<trust.length;i++){
            if(!map.containsKey(trust[i][1])){
                map.put(trust[i][1], new HashSet<Integer>());
            }
            map.get(trust[i][1]).add(trust[i][0]);
        }
        int possibleTownJudge = -1;
        for(int i=1;i<=n;i++){
            if(map.containsKey(i) && map.get(i).size()==n-1){
                if(possibleTownJudge < 0){
                    possibleTownJudge = i;
                }else{
                    return -1;
                }
            }
        }
        if(possibleTownJudge > 0){
            for(int key : map.keySet()){
                if(map.get(key).contains(possibleTownJudge)){
                    return -1;
                }
            }
        }
        return possibleTownJudge;
    }

    public static void main(String[] args) {
        System.out.println(findJudge(2,new int[][]{{1,2}}));
        System.out.println(findJudge(3,new int[][]{{1,3},{2,3}}));
        System.out.println(findJudge(3,new int[][]{{1,3},{2,3},{3,1}}));
        System.out.println(findJudge(1,new int[][]{}));
    }
}
