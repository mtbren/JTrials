package com.internal;

import java.util.ArrayList;
import java.util.List;

public class Shift2DArray {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int offset = k % (grid.length * grid[0].length);

        int[] consolidatedArray = new int[grid.length * grid[0].length];
        int temp = offset;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j< grid[0].length;j++){
                consolidatedArray[temp] = grid[i][j];
                temp ++;
                if(temp == consolidatedArray.length)
                    temp = 0;
            }
        }
        List<List<Integer>> returnList = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        for(int i=0;i<consolidatedArray.length;i++){
                innerList.add(consolidatedArray[i]);
                if(innerList.size()==grid[0].length) {
                    returnList.add(innerList);
                    innerList = new ArrayList<>();
                }
        }
        return returnList;
    }

    public static void main(String[] args) {
        new Shift2DArray().shiftGrid(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 1);
        new Shift2DArray().shiftGrid(new int[][]{{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}}, 4);
    }
}
