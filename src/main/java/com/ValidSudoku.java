package com;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        boolean[] taken ;
        int elem = -1;

        // Validate rows
        taken = new boolean[9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++) {
                if (board[i][j] == '.')
                    continue;
                else {
                    elem = Integer.parseInt("" + board[i][j]);
                    if (taken[elem - 1] == true) {
                        return false;
                    }else{
                        taken[elem - 1] = true;
                    }
                }
            }
            taken = new boolean[9];
        }

        // Validate columns
        taken = new boolean[9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++) {
                if (board[j][i] == '.')
                    continue;
                else {
                    elem = Integer.parseInt("" + board[j][i]);
                    if (taken[elem - 1] == true) {
                        return false;
                    }else{
                        taken[elem - 1] = true;
                    }
                }
            }
            taken = new boolean[9];
        }

        //Validate squares
        Set<Character> square = new HashSet<Character>();
        int row = 0;
        while(row<9) {
            int col = 0;
            while(col<9) {
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if (board[i][j] == '.')                            continue;
                        if (square.contains(board[i][j])) {
                            return false;
                        } else {
                            square.add(board[i][j]);
                        }
                    }
                }
                square = new HashSet<Character>();
                col=col+3;
            }
            row=row+3;
        }
        return true;
    }

    public static void main(String[] args) {
        char [][] s1 = new char[][]{{'5','3','.','.','7','.','.','.','.'},
                                    {'6','.','.','1','9','5','.','.','.'},
                                    {'.','9','8','.','.','.','.','6','.'},
                                    {'8','.','.','.','6','.','.','.','3'},
                                    {'4','.','.','8','.','3','.','.','1'},
                                    {'7','.','.','.','2','.','.','.','6'},
                                    {'.','6','.','.','.','.','2','8','.'},
                                    {'.','.','.','4','1','9','.','.','5'},
                                    {'.','.','.','.','8','.','.','7','9'}};
        
        System.out.println(isValidSudoku(s1));//true

        char [][] s2 = new char[][]{{'8','3','.','.','7','.','.','.','.'},
                                    {'6','.','.','1','9','5','.','.','.'},
                                    {'.','9','8','.','.','.','.','6','.'},
                                    {'8','.','.','.','6','.','.','.','3'},
                                    {'4','.','.','8','.','3','.','.','1'},
                                    {'7','.','.','.','2','.','.','.','6'},
                                    {'.','6','.','.','.','.','2','8','.'},
                                    {'.','.','.','4','1','9','.','.','5'},
                                    {'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(s2));//false

        char [][] s3 = new char[][]{{'.','.','4','.','.','.','6','3','.'},
                                    {'.','.','.','.','.','.','.','.','.'},
                                    {'5','.','.','.','.','.','.','9','.'},
                                    {'.','.','.','5','6','.','.','.','.'},
                                    {'4','.','3','.','.','.','.','.','1'},
                                    {'.','.','.','7','.','.','.','.','.'},
                                    {'.','.','.','5','.','.','.','.','.'},
                                    {'.','.','.','.','.','.','.','.','.'},
                                    {'.','.','.','.','.','.','.','.','.'}};

        System.out.println(isValidSudoku(s3)); //false
    }
}
