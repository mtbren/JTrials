package com;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int[][] retMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                retMatrix[j][i] = matrix[i][j];
            }
        }
        return retMatrix;
    }

    public static void main(String[] args) {
        //new TransposeMatrix().transpose(new int[][]{{1,2},{3,4}});
        //new TransposeMatrix().transpose(new int[][]{{1}});
        //new TransposeMatrix().transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        //new TransposeMatrix().transpose(new int[][]{{1,2,3},{4,5,6}});
        new TransposeMatrix().transpose(new int[][]{{1,2,3},{4}});
    }

}
