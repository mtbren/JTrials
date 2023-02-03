package com.internal;

public class ReshapeMatrix {
    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int[][] retMat = new int[r][c];

        int row = 0, col = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                retMat[row][col]=mat[i][j];
                col++;
                if(col==c){
                    row++;
                    col=0;
                }
            }
        }

        return retMat;
    }

    public static void main(String[] args) {
        System.out.println(matrixReshape(new int[][]{{1,2},{3,4}}, 4,1));
    }
}
