package com;

/**
 * Created by Amit on 11/18/2018.
 */
public class Pass {
    public static void main(String... atgs){

        String str = "abc";
        Integer a = 2 ;

        System.out.println(str);

        modifyString(str);

        System.out.println(str);

        str=returnString(str);

        System.out.println(str);


        System.out.println(a);

        modifyInt(a);

        System.out.println(a);

        a=returnInt(a);

        System.out.println(a);
    }

    private static void modifyString(String myString){
        myString = myString.toUpperCase();
    }

    private static String returnString(String myString){
        return myString.toUpperCase();
    }

    private static void modifyInt(Integer i){
        i ++;
    }

    private static Integer returnInt(Integer i){
        i ++;
        return i;
    }


}

class Anim{
    String name;
    int age;
}