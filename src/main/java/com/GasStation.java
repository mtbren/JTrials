package com;

import java.util.*;
import java.util.stream.Collectors;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = Arrays.stream(gas).sum();
        int costSum = Arrays.stream(cost).sum();
        List<Integer> nonZeroTravelSumIndices = new ArrayList<Integer>();
        if(costSum > gasSum)
            return -1;
        int[] travelSum = new int[gas.length];

        for(int i=0;i<gas.length;i++){
            travelSum[i]=gas[i]-cost[i];
            if(travelSum[i]!=0)
                nonZeroTravelSumIndices.add(i);
        }
        int[] reducedTravelSum = new int[nonZeroTravelSumIndices.size()];
        for(int i=0; i<nonZeroTravelSumIndices.size();i++){
            reducedTravelSum[i] = travelSum[nonZeroTravelSumIndices.get(i)];
        }
        if(reducedTravelSum.length==0)
            return 0;
        for(int i=0;i<reducedTravelSum.length;i++){
            if((int)reducedTravelSum[i] < 0)
                continue;
            else{
                int runningSum = (int)reducedTravelSum[i];
                int j = i == reducedTravelSum.length-1 ? 0 : i + 1;
                while(j != i){
                    runningSum += (int)reducedTravelSum[j];
                    if(runningSum < 0)
                        break;
                    j += 1;
                    if (j > reducedTravelSum.length - 1)
                        j = 0;
                }
                if(j == i && runningSum >= 0)
                    return nonZeroTravelSumIndices.get(i);
            }
        }

        return -1;
        /*for(int i=0;i<travelSum.length;i++){
            if(travelSum[i]<0)
                continue;
            else{
                int runningSum = travelSum[i];
                int j = i == travelSum.length-1 ? 0 : i + 1;
                while(j != i){
                    runningSum += travelSum[j];
                    if(runningSum < 0)
                        break;
                    j += 1;
                    if (j > travelSum.length - 1)
                        j = 0;
                }
                if(j == i && runningSum >= 0)
                    return i;
            }
        }
        return -1;
        */

    }

    public static void main(String[] args) {
        System.out.println(new GasStation()
                .canCompleteCircuit(
                        new int[]{2},
                        new int[]{2}
                )); //
        System.out.println(new GasStation()
                .canCompleteCircuit(
                        new int[]{1,2,3,4,5},
                        new int[]{3,4,5,1,2}
                )); // 3
        System.out.println(new GasStation()
                .canCompleteCircuit(
                        new int[]{2,3,4},
                        new int[]{3,4,3}
                )); // -1
    }
}
