package com.internal;

public class StringWithOddCountCharacters {
    public String generateTheString(int n) {
        StringBuffer sBuf = new StringBuffer();
        if(n%2==0){
            sBuf.append('b');
            n--;
        }
        for(int i=0;i<n;i++){
            sBuf.append('a');
        }
        return sBuf.toString();
    }
}
