package com.internal;

public class BackSpaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        while(s.contains("#"))
            s=calcStringBackSpace(s);
        while(t.contains("#"))
            t=calcStringBackSpace(t);

        return s.equals(t);
    }
    private static String calcStringBackSpace(String s){
        if(s==null){
            return "";
        }
        if(!s.contains("#"))
            return s;
        else{
            if(s.startsWith("#"))
                return s.replaceFirst("#","");
            else
                return s.substring(0,s.indexOf('#',0)-1)+
                        s.substring(s.indexOf('#')+1);
        }
    }

    public static void main(String[] args) {


        System.out.println(backspaceCompare("abcd","abcd"));//true
        System.out.println(backspaceCompare("ab#d","ac#d"));//true
        System.out.println(backspaceCompare("ab#d","ad"));//true
        System.out.println(backspaceCompare("#asd","#ac#sd"));//true
        System.out.println(backspaceCompare("a#","#"));//true
        System.out.println(backspaceCompare("a#","b#"));//true
        System.out.println(backspaceCompare("#b","b"));//true
        System.out.println(backspaceCompare("#","a#a#a#b#"));//true
        System.out.println(backspaceCompare("#","####"));//true
        System.out.println(backspaceCompare("a","aaa##"));//true
        System.out.println(backspaceCompare("ab#c","ad#c"));//true
        System.out.println(backspaceCompare("ab##","c#d#"));//true

        System.out.println(backspaceCompare("ass","ac#s"));//false
        System.out.println(backspaceCompare("#","####c"));//false
        System.out.println(backspaceCompare("#d","####c"));//false
        System.out.println(backspaceCompare("acv","a"));//false
        System.out.println(backspaceCompare("a#c","b"));//false



    }
}
