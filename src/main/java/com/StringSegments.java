package com;
import java.util.StringTokenizer;

public class StringSegments {
    private static int countSegments(String s) {
        StringTokenizer strtkn = new StringTokenizer(s," ");
        return strtkn.countTokens();
    }

    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));//5
        System.out.println(countSegments("Hello"));//1
        System.out.println(countSegments("love live! mu'sic forever"));//4
        System.out.println(countSegments(""));//0
    }
}
