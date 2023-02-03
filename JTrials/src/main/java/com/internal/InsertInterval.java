package com.internal;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals,
                          int[] newInterval) {

        List<int[]> newNos = new ArrayList<>();
        if(intervals.length==0)
            return new int[][]{{newInterval[0],newInterval[1]}};
        if(intervals[0][0]>newInterval[1] ){
            int[][] intervalCopy = new int[intervals.length+1][2];
            intervalCopy[0] = newInterval;
            for(int i=0;i< intervals.length;i++)
                    intervalCopy[i+1]=intervals[i];

            return intervalCopy;
        }else if (intervals[intervals.length-1][1]<newInterval[0]){
            int[][] intervalCopy = new int[intervals.length+1][2];
            for(int i=0;i< intervals.length;i++)
                intervalCopy[i]=intervals[i];
            intervalCopy[intervalCopy.length-1] = newInterval;
            return intervalCopy;
        }
        boolean internalMerged = false;
        for(int i=0;i< intervals.length;i++){
            if(!isMatch(intervals[i],newInterval)){
                if(!internalMerged && i<intervals.length-1 &&
                        newInterval[1]<intervals[i+1][0] &&
                        newInterval[0]>intervals[i][1]  ) {
                    internalMerged=true;
                    newNos.add(newInterval);
                }
                newNos.add(intervals[i]);
            }else{
                int[] from = intervals[i];
                if(from[0] > newInterval[0])
                    from[0] = newInterval[0];
                i++;
                while(i<intervals.length  && isMatch(intervals[i], newInterval)){
                    //merge
                    i++;
                }
                int[] to = intervals[i-1];
                if(to[1] < newInterval[1]){
                        to[1] = newInterval[1];
                }
                newNos.add(new int[]{from[0], to[1]});
                i=i-1;
            }
        }
        int[][] newRetArr = new int[newNos.size()][2];
        for(int i=0;i< newNos.size();i++){
            newRetArr[i] = newNos.get(i);
        }
        return newRetArr;
    }
    private boolean isMatch(int[] inArray, int[] newInterval){
        if (newInterval[0] > inArray[1] || newInterval[1] < inArray[0]){
            return false;
        }else{
            return true;
        }

    }

    public static void main(String[] args) {
        /*new InsertInterval().insert(new int[][]{{1,3},{6,9}}, new int[]{2,5});
        new InsertInterval().insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8});
        new InsertInterval().insert(new int[][]{{3,4},{6,9}}, new int[]{0,2});
        new InsertInterval().insert(new int[][]{{1,5}}, new int[]{6,8});*/
        new InsertInterval().insert(new int[][]{{1,5}}, new int[]{0,3});
    }
}
