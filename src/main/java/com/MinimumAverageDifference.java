package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MinimumAverageDifference {
    public int minimumAverageDifference(int[] nums) {
        if (nums.length==1){
            return 0;
        }
        long totalLeft = nums[0];
        int totalLeftCount = 1;
        long totalRight = 0;
        for(int i=1;i<nums.length;i++){
            totalRight = totalRight + nums[i];
        }
        int totalRightCount = nums.length-1;

        Map<Integer, Long> avgDiffMap = new HashMap<Integer, Long>();
        long minAvg = Math.abs(
                totalLeft/totalLeftCount - totalRight/totalRightCount);
        int minAvgPtr = 0;
        avgDiffMap.put(0,
                Math.abs(
                        totalLeft/totalLeftCount - totalRight/totalRightCount));


        for(int i=1;i< nums.length;i++){
            totalLeft = totalLeft+nums[i];
            totalLeftCount++;
            totalRight = totalRight-nums[i];
            totalRightCount--;

            if(i < nums.length-1) {
                avgDiffMap.put(i,
                        Math.abs(
                                totalLeft / totalLeftCount -
                                        totalRight / totalRightCount));
                if(Math.abs(
                        totalLeft / totalLeftCount -
                                totalRight / totalRightCount) < minAvg) {
                    minAvg = Math.abs(
                            totalLeft / totalLeftCount -
                                    totalRight / totalRightCount);
                    minAvgPtr = i;
                }
            }else {
                avgDiffMap.put(i,
                        Math.abs(totalLeft / totalLeftCount));
                if(Math.abs(
                        totalLeft / totalLeftCount) < minAvg) {
                    minAvg = Math.abs(
                            totalLeft / totalLeftCount);
                    minAvgPtr = i;
                }
            }
        }
        return minAvgPtr;
    }

    public static void main(String[] args) {
        MinimumAverageDifference mad = new MinimumAverageDifference();
        System.out.println(mad.minimumAverageDifference(
                new int[]{2,5,3,9,5,3}
        ));
        System.out.println(mad.minimumAverageDifference(
                new int[]{0}
        ));
        System.out.println(mad.minimumAverageDifference(
                new int[]{100000,100000,100000,100000,100000,0,0,0,0,0}
        ));
    }

}
