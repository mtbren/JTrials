package com.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LuckyNosInAMatrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        Map<Integer, Integer> rowMinMap = new HashMap<>();
        Map<Integer, Integer> colMaxMap = new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            int minRow = Integer.MAX_VALUE;
            int minRowRow = 0;
            int minRowCol = 0;
            for(int j=0;j<matrix[0].length;j++){
                if(minRow > matrix[i][j]) {
                    minRow = matrix[i][j];
                    minRowRow = i;
                    minRowCol = j;
                    rowMinMap.put(minRowRow,minRowCol);
                }
            }
        }

        for(int i=0;i<matrix[0].length;i++){
            int maxCol = Integer.MIN_VALUE;
            int maxColRow = 0;
            int maxColCol = 0;
            for(int j=0;j<matrix.length;j++){
                if(maxCol < matrix[j][i]) {
                    maxCol = matrix[j][i];
                    maxColRow = j;
                    maxColCol = i;
                    colMaxMap.put(maxColCol,maxColRow);
                }
            }
        }

        List<Integer> numsToRet = new ArrayList<>();

        for(int row : rowMinMap.keySet()){
            if(colMaxMap.get(rowMinMap.get(row))!=null && colMaxMap.get(rowMinMap.get(row))==row )
                numsToRet.add(matrix[row][rowMinMap.get(row)]);
        }
        return numsToRet;
    }

    public static void main(String[] args) {
        new LuckyNosInAMatrix().luckyNumbers(new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}});
    }
}
