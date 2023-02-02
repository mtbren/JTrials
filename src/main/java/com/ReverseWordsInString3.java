package com;

import java.util.StringTokenizer;

public class ReverseWordsInString3 {
    private static String reverseWords(String s) {
        StringTokenizer strtkn = new StringTokenizer(s," ");
        StringBuffer strbuf = new StringBuffer();
        StringBuffer temp;
        while(strtkn.hasMoreTokens()){
            temp = new StringBuffer(strtkn.nextToken());
            strbuf.append(temp.reverse()).append(" ");
        }
        strbuf.replace(strbuf.length()-1,strbuf.length(),"");
        return strbuf.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("God Ding"));
    }
}
