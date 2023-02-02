package com;

public class MinCostClimbingStairs {
    public static int minCostClimbingStairsDynamic(int[] cost) {
        int[] minCost = new int[cost.length];
        minCost[0] = cost[0];
        minCost[1] = cost[1];
        for(int i=2;i<cost.length;i++){
            minCost[i]=cost[i]+Math.min(minCost[i-1], minCost[i-2]);
        }
        return Math.min(minCost[minCost.length-1],minCost[minCost.length-2]);
    }
    public static int minCostClimbingStairs(int[] cost) {
        int minCost = Math.min(calcCost(cost, 0), calcCost(cost, 1));
        int even = 0, odd = 0;
        for (int i = 0; i < cost.length; i++) {
            if (i%2==0){
                even = even + cost[i];
            }else{
                odd = odd + cost[i];
            }
        }
        minCost = Math.min(minCost, even);
        minCost = Math.min(minCost, odd);
        return minCost;
    }

    private static int calcCost(int[] cost, int index) {
        int i = index, minCost = 0;
        while (i < cost.length) {
            minCost = minCost + cost[i];
            if (i < cost.length - 2) {
                if (cost[i + 1] < cost[i + 2]) {
                    i = i + 1;
                } else {
                    i = i + 2;
                }
            } else if (i == cost.length - 2) {
                break;
            } else {
                i = i + 1;
            }
        }
        return minCost;
    }

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairsDynamic(new int[]{10, 15, 20})); //15
        System.out.println(minCostClimbingStairsDynamic(
                new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1})); //6
        System.out.println(minCostClimbingStairsDynamic(new int[]{0,1,2,2})); //2
    }
}
