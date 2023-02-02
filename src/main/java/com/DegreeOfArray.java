package com;

import java.util.*;

public class DegreeOfArray {
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> stats = new HashMap<Integer, int[]>();
        int[] oldStat;
        for (int i = 0; i < nums.length; i++) {
            if (!stats.containsKey(nums[i])) {
                stats.put(nums[i], new int[]{1, i, i, 1});
            } else {
                oldStat = stats.get(nums[i]);
                stats.put(nums[i], new int[]{oldStat[0] + 1, oldStat[1], i, i - oldStat[1]+1});
            }
        }

        Map<Integer, List<Integer>> occurrencesVsKeys = new HashMap<Integer, List<Integer>>();
        stats.keySet().forEach(key -> {
            if (!occurrencesVsKeys.containsKey(stats.get(key)[0])) {
                List<Integer> keyList = new ArrayList<Integer>();
                keyList.add(key);
                occurrencesVsKeys.put(stats.get(key)[0], keyList);
            } else {
                occurrencesVsKeys.get(stats.get(key)[0]).add(key);
            }
        });

        Object[] occurArr = occurrencesVsKeys.keySet().toArray();
        Arrays.sort(occurArr);

        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < occurrencesVsKeys.get(occurArr[occurArr.length - 1]).size(); i++) {
            if (minDist > stats.get(occurrencesVsKeys.get(occurArr[occurArr.length - 1]).get(i))[3]) {
                minDist = stats.get(occurrencesVsKeys.get(occurArr[occurArr.length - 1]).get(i))[3];
            }
        }

        return minDist;
    }

    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1, 2, 2, 3, 1}));//2
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1,4,2}));//6
        System.out.println(findShortestSubArray(new int[]{1}));//1

    }
}
