package com.internal;

import java.util.StringTokenizer;

public class GoatLatin {
    public static String toGoatLatin(String sentence) {
        StringTokenizer strtkn = new StringTokenizer(sentence," ");
        StringBuilder strBldr = new StringBuilder();
        StringBuilder strBldrWord = new StringBuilder();
        int index = 0;
        while(strtkn.hasMoreTokens()){

            strBldrWord = new StringBuilder(strtkn.nextToken());
            if(strBldrWord.charAt(0)=='a' || strBldrWord.charAt(0)=='e' ||
                    strBldrWord.charAt(0)=='i' || strBldrWord.charAt(0)=='o' ||
                    strBldrWord.charAt(0)=='u' || strBldrWord.charAt(0)=='A' ||
                    strBldrWord.charAt(0)=='E' || strBldrWord.charAt(0)=='I' ||
                    strBldrWord.charAt(0)=='O' || strBldrWord.charAt(0)=='U'){
                strBldrWord = strBldrWord.append("ma");
            }else{
                char c = strBldrWord.charAt(0);
                strBldrWord = new StringBuilder(strBldrWord.substring(1,
                        strBldrWord.length()));
                strBldrWord = strBldrWord.append(c);
                strBldrWord = strBldrWord.append("ma");
            }
            for(int j=0;j<=index;j++){
                strBldrWord.append('a');
            }
            index++;
            strBldr = strBldr.append(strBldrWord);
            if(strtkn.hasMoreTokens())
                strBldr = strBldr.append(" ");
        }
        return strBldr.toString();
    }

    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
        System.out.println(toGoatLatin("I"));
        System.out.println(toGoatLatin("t"));

    }
}
