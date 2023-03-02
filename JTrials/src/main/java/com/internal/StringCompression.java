package com.internal;

public class StringCompression {
    public int compress(char[] chars) {
        int currPtr = 0;
        for(int i=0;i<chars.length;){
            int charRep = 1;
            int j=i+1;
            while(j<chars.length && chars[j]==chars[i]) {
                j++;
                charRep++;
            }
            if(charRep > 1){
                chars[currPtr++] = chars[i];
                String repS = String.valueOf(charRep);
                for(char s : repS.toCharArray()){
                    chars[currPtr++] = s;
                }
            }else{
                chars[currPtr++] = chars[i];
            }
            i=j;
        }
        System.out.println(chars);
        return currPtr;
    }

    public static void main(String[] args) {
        System.out.println(new StringCompression().compress(new char[]{'a','a','b','b','c','c','c'}));
        System.out.println(new StringCompression().compress(new char[]{'a'}));
        System.out.println(new StringCompression().compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));

    }

}
