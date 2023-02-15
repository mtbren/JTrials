package com.internal;

import java.util.stream.IntStream;

public class AddBinaryStrings {
    public String addBinary(String a, String b) {
        StringBuilder strb = new StringBuilder();
        int ptrA = a.length()-1;
        int ptrB = b.length()-1;
        int carry = 0;
        while(ptrA >= 0 && ptrB >= 0){
            if(a.charAt(ptrA) == '1'){
                if(b.charAt(ptrB) == '1'){
                    if(carry == 1){
                        strb.insert(0,'1');
                    }else{
                        strb.insert(0,'0');
                        carry = 1;
                    }
                }else{
                    if(carry == 1){
                        strb.insert(0,'0');
                    }else{
                        strb.insert(0,'1');
                    }
                }
            }else{
                if(b.charAt(ptrB) == '1'){
                    if(carry == 1){
                        strb.insert(0,'0');
                    }else{
                        strb.insert(0,'1');
                    }
                }else{
                    if(carry == 1){
                        strb.insert(0,'1');
                        carry = 0;
                    }else{
                        strb.insert(0,'0');
                    }
                }
            }
            ptrA--;ptrB--;
        }
        String remString = ptrA > ptrB ? a.substring(0,ptrA+1) : b.substring(0,ptrB+1);
        int ptrR = remString.length()-1;
        while(ptrR >= 0){
            if(remString.charAt(ptrR)=='1'){
                if(carry == 1){
                    strb.insert(0,'0');
                }else{
                    strb.insert(0,'1');
                }
            }else{
                if(carry == 1){
                    strb.insert(0,'1');
                    carry = 0;
                }else{
                    strb.insert(0,'0');
                }
            }
            ptrR--;
        }
        if (carry==1)
            strb.insert(0,'1');
        return strb.toString();

    }

    public static void main(String[] args) {
        System.out.println(new AddBinaryStrings().addBinary("110","10"));
    }
}
