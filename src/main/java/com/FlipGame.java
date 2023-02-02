package com;

import java.util.ArrayList;
import java.util.List;

public class FlipGame {
    private static List<String> generatePossibleNextMoves(String currentState) {
        StringBuffer currState = new StringBuffer(currentState);

        List<String> finalString = new ArrayList<String>();

        for(int i=0;i<currState.length()-1;i++){
            if(currState.charAt(i)=='+' && currState.charAt(i+1)=='+'){
                currState.replace(i,i+2,"--");
                finalString.add(currState.toString());
                currState = new StringBuffer(currentState);
            }
        }
        return finalString;
    }

    public static void main(String[] args) {
        System.out.println(generatePossibleNextMoves("++++"));
        System.out.println(generatePossibleNextMoves("+"));
    }
}
