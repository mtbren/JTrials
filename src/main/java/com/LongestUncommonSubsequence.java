package com;

public class LongestUncommonSubsequence {
    private static int findLUSlength(String a, String b) {
        StringBuffer lusa = new StringBuffer();
        StringBuffer lusb = new StringBuffer();
        if(b.length() > a.length()){
            return b.length();
        }else if (a.length() > b.length()){
            return a.length();
        }else if(!a.contains(b)){
            return a.length();
        }

        for(int i=0;i<a.length();i++){
           if(b.indexOf(a.charAt(i))<0){
               lusa.append(a.charAt(i));
           }
        }
        for(int i=0;i<b.length();i++){
            if(a.indexOf(b.charAt(i))<0){
                lusb.append(b.charAt(i));
            }
        }
        if(lusa.length()==0 && lusb.length()==0){
            return -1;
        }
        return lusa.length()>lusb.length()? lusa.length():lusb.length();
    }

    public static void main(String[] args) {
        System.out.println(findLUSlength("aba","cdc"));
        System.out.println(findLUSlength("aaa","bbb"));
        System.out.println(findLUSlength("aaa","aaa"));
    }
}
