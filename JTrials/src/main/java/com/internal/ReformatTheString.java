package com.internal;

public class ReformatTheString {
    public String reformat(String s) {
        StringBuffer nos = new StringBuffer();
        StringBuffer alph= new StringBuffer();
        StringBuffer finalSB = new StringBuffer();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                alph.append(s.charAt(i));
            else
                nos.append(s.charAt(i));
        }
        if(Math.abs(nos.length() - alph.length()) > 2 ||
                (nos.length() == 0 && alph.length()==2) ||
                (alph.length() == 0 && nos.length()==2) )
            return "";
        else {
            if(nos.length() > alph.length()){
                int ptr = 0;
                while(ptr < alph.length()){
                    finalSB.append(nos.charAt(ptr));
                    finalSB.append(alph.charAt(ptr++));
                }
                while(ptr<nos.length()){
                    finalSB.append(nos.charAt(ptr++));
                }
            }else{
                int ptr = 0;
                while(ptr < nos.length()){
                    finalSB.append(alph.charAt(ptr));
                    finalSB.append(nos.charAt(ptr++));
                }
                while(ptr<alph.length()){
                    finalSB.append(alph.charAt(ptr++));
                }
            }
        }
        return finalSB.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReformatTheString().reformat("a0b1c2"));
    }
}
