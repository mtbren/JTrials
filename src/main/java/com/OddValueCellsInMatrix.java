package com;

public class OddValueCellsInMatrix {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int oddCount = 0;

        for(int i=0;i<indices.length;i++){
            for (int k = 0; k < n; k++) {
                matrix[indices[i][0]][k]++;
                if (matrix[indices[i][0]][k] % 2 == 0)
                    oddCount--;
                else
                    oddCount++;
            }
        }
        for(int j=0;j<indices.length;j++){
            for (int k = 0; k < m; k++) {
                matrix[k][indices[j][1]]++;
                if (matrix[k][indices[j][1]] % 2 == 0)
                    oddCount--;
                else
                    oddCount++;
            }
        }

        return oddCount;
    }

    public static void main(String[] args) {
        System.out.println(new OddValueCellsInMatrix().oddCells(
                2,3,new int[][]{{0,1},{1,1}}
        ));
        System.out.println(new OddValueCellsInMatrix().oddCells(
                2,2,new int[][]{{1,1},{0,0}}
        ));
        System.out.println(new OddValueCellsInMatrix().oddCells(
                48,37,new int[][]{{40,5}}
        ));
    }
}
