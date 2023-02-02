package com;

import java.util.StringTokenizer;

public class ReverseSentence {
    private static String reverse(String sentence){
        StringBuffer revStr = new StringBuffer();
        StringTokenizer strtkn = new StringTokenizer(sentence," ");
        while(strtkn.hasMoreTokens()){
            revStr.insert(0,strtkn.nextToken()+" ");
            //revStr.append(" ");
        }
        return revStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("This is a String"));
    }
}
