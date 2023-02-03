package com.internal;

import java.util.*;

public class MatrixCellsInDistanceOrder {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] retMatrix = new int[rows*cols][1];
        Map<Integer, List<int[]>> distMap = new HashMap<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int dist = Math.abs(rCenter - r) + Math.abs(cCenter - c);
                if(distMap.containsKey(dist)){
                    distMap.get(dist).add(new int[]{r,c});
                }else{
                    distMap.put(dist, new ArrayList<int[]>());
                    distMap.get(dist).add(new int[]{r,c});
                }
            }
        }
        Iterator iter = distMap.keySet().stream().sorted().iterator();
        int rowCount=0;
        while(iter.hasNext()){
            List<int[]> valList = distMap.get(iter.next());
            for(int[] listElem : valList){
                retMatrix[rowCount] = listElem;
                rowCount++;
            };
        }
        return retMatrix;
    }

    public static void main(String[] args) {
        new MatrixCellsInDistanceOrder().allCellsDistOrder(1,2,0,0);
        new MatrixCellsInDistanceOrder().allCellsDistOrder(2,2,0,1);
        new MatrixCellsInDistanceOrder().allCellsDistOrder(2,3,1,2);
    }
}
