package com.internal;

public class WinnerOnTicTacToeGame {
    public String tictactoe(int[][] moves) {
        int[][] matrix = new int[3][3];
        for(int i=0;i< moves.length;i=i+2){
            matrix[moves[i][0]][moves[i][1]]=1;
        }
        for(int i=1;i< moves.length;i=i+2){
            matrix[moves[i][0]][moves[i][1]]=2;
        }
        int winner = isWinner(matrix);
        if(winner == 1)
            return "A";
        if(winner == 2)
            return "B";
        if(moves.length < 9)
            return "Pending";
        return "Draw";
    }
    private int isWinner(int[][] matrix){

        if(matrix[0][0] == matrix[0][1] &&  matrix[0][1] == matrix[0][2]){
            return matrix[0][0];
        }else if(matrix[1][0] == matrix[1][1] &&  matrix[1][1] == matrix[1][2]){
            return matrix[1][0];
        }else if(matrix[2][0] == matrix[2][1] &&  matrix[2][1] == matrix[2][2]){
            return matrix[2][0];
        }else if(matrix[0][0] == matrix[1][0] &&  matrix[1][0] == matrix[2][0]){
            return matrix[0][0];
        }else if(matrix[0][1] == matrix[1][1] &&  matrix[1][1] == matrix[2][1]){
            return matrix[0][1];
        }else if(matrix[0][2] == matrix[1][2] &&  matrix[1][2] == matrix[2][2]){
            return matrix[0][2];
        }else if(matrix[0][0] == matrix[1][1] &&  matrix[1][1] == matrix[2][2]){
            return matrix[0][0];
        }else if(matrix[0][2] == matrix[1][1] &&  matrix[1][1] == matrix[2][0]){
            return matrix[0][2];
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new WinnerOnTicTacToeGame().tictactoe(
                new int[][]{{0,0},{2,0},{1,1},{2,1},{2,2}}
        ));
        System.out.println(new WinnerOnTicTacToeGame().tictactoe(
                new int[][]{{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}}
        ));
        System.out.println(new WinnerOnTicTacToeGame().tictactoe(
                new int[][]{{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}}
        ));
        System.out.println(new WinnerOnTicTacToeGame().tictactoe(
                new int[][]{{1,0},{2,2},{2,0},{0,1},{1,1}}
        ));
        //[[1,0],[2,2],[2,0],[0,1],[1,1]]
    }
}
