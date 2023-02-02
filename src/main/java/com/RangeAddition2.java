package com;

public class RangeAddition2 {
    private static int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n;
        }
        int leastRow = Integer.MAX_VALUE, leastCol = Integer.MAX_VALUE;
        //int leastRowCount = 0, leastColCount = 0;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i][0] <= leastRow) {
                if (ops[i][0] < leastRow) {
                    leastRow = ops[i][0];
                   // leastRowCount = 1;
                } else {
                  //  leastRowCount++;
                }
            }
            for (int j = 1; j < ops[i].length; j++) {
                if(ops[i][j]<=leastCol) {
                    if (ops[i][j] < leastCol) {
                        leastCol = ops[i][j];
                       // leastColCount = 1;
                    } else {
                       // leastColCount++;
                    }
                }
            }
        }

        if(leastRow<=m && leastCol<=n){
            return leastRow*leastCol;
        }else{
            return m*n;
        }


    }

    public static void main(String[] args) {
        /*System.out.println(maxCount(3, 3, new int[][]{{2, 2}, {3, 3}}));
        System.out.println(maxCount(3, 3, new int[][]{{2, 2}, {3, 3},
                {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2},
                {3, 3}, {3, 3}, {3, 3}}));
        System.out.println(maxCount(3, 3, new int[][]{}));*/
        System.out.println(maxCount(26, 17, new int[][]{{20,10},{26,11},{2,11},{4,16},{2,3},{23,13},{7,15},{11,11},{25,13},{11,13},{13,11},{13,16},{26,17}}));

    }
}
