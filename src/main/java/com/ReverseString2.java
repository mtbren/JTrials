package com;

public class ReverseString2 {
    private static String reverseStr(String s, int k) {
        StringBuffer revBuf = new StringBuffer();
        StringBuffer tempBuf = new StringBuffer();
        if(s.length()<k){
            revBuf.append(s);
            revBuf = revBuf.reverse();
        }else{
            for(int i=0,j=1;i<s.length();i++,j++){
                if(j<=k){
                    tempBuf.insert(0,s.charAt(i));
                }else{
                    tempBuf.append(s.charAt(i));
                }
                if(j==2*k){
                    j=0;
                    revBuf.append(tempBuf);
                    tempBuf=new StringBuffer();
                }
            }
            revBuf.append(tempBuf);
        }

        return revBuf.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",2));
        System.out.println(reverseStr("abcd",2));
    }
}
