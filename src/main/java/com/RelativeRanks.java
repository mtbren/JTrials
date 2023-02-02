package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        String[] ranks = new String[score.length];
        int[] scoreCopy = Arrays.copyOf(score,score.length);
        Arrays.sort(score);

        Map<Integer,Integer> scoreMap = new HashMap<Integer,Integer>();
        for(int i=score.length-1,j=1;i>-1;i--,j++){
            scoreMap.put(score[i],j);
        }
        for(int i=0;i<scoreCopy.length;i++){
            if(scoreMap.get(scoreCopy[i])>3){
                ranks[i]=""+scoreMap.get(scoreCopy[i]);
            }else{
                if(scoreMap.get(scoreCopy[i])==1){
                    ranks[i]="Gold Medal";
                }else if(scoreMap.get(scoreCopy[i])==2){
                    ranks[i]="Silver Medal";
                }else if(scoreMap.get(scoreCopy[i])==3){
                    ranks[i]="Bronze Medal";
                }
            }
        }

        return ranks;
    }

    public static void main(String[] args) {
        String[] arr = findRelativeRanks(new int[]{5,4,3,2,1});

        arr = findRelativeRanks(new int[]{10,3,8,9,4});
        System.out.println(arr);
    }
}
