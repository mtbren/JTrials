package com;

public class LowerCase {
    public static String toLowerCase(String s) {
        StringBuffer n = new StringBuffer();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<91){
                int j=s.charAt(i)+32;
                char c = (char)j;
                n.append(c);

            }else{
                n.append(s.charAt(i));
            }
        }
        return n.toString();
    }

    public static void main(String[] args) {
        int a = '[';
        //int b = 'a';
        System.out.println(a);
        //System.out.println(b);*/
        char c=97;


        System.out.println(toLowerCase("AbcDef"));
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("here"));
        System.out.println(toLowerCase("LOVELY"));

    }
}
