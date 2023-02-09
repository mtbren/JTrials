package com.internal;

public class CountNegativeNumbersInSortedMatrix {
    public int countNegatives(int[][] grid) {
        int countNegative = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=grid[i].length-1;j>=0;j--){
                if(grid[i][j] < 0)
                    countNegative ++;
                else
                    break;
            }
        }
        return countNegative;
    }

    public static void main(String[] args) {

    }
}
