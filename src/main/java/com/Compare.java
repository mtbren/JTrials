package com;

import java.util.ArrayList;

public class Compare {
    public static void main(String... args){
        String str1 = "abcde";
        StringBuilder strBldr1 = new StringBuilder("abcde");
        String str2 = new String("abcde");
        String str3 = "abcde";

        if(str1 == str2){
            System.out.println("It works but should not have !!!");
        }
        if(str1==str3){
            System.out.println("str1 == str3");
        }


    }
}
