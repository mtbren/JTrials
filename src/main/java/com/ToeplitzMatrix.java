package com;

public class ToeplitzMatrix {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix.length == 1)
            return true;
        for(int i=1;i< matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j] != matrix[i-1][j-1]) {
                    System.out.println("i="+i+", j="+j+", matrix[i][j]="+matrix[i][j]);
                    System.out.println("matrix[i-1][j-1]="+matrix[i-1][j-1]);
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(
                isToeplitzMatrix(new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}}));
        System.out.println(
                isToeplitzMatrix(new int[][]{{1,2},{2,2}}));

        System.out.println(
                isToeplitzMatrix(new int[][]{{36,59,71,15,26,82,87},
                        {56,36,59,71,15,26,82},{15,0,36,59,71,15,26}}));
    }
}
