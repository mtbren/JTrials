package com.internal;

public class BinaryNumberWithAlternatingBits {
    public static boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        for(int i=0;i<=s.length()-2;i++){
            if(s.charAt(i)==s.charAt(i+1))
                return false;
        }
        //System.out.println(s);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));//true
        System.out.println(hasAlternatingBits(7));//false
        System.out.println(hasAlternatingBits(11));//false
        System.out.println(hasAlternatingBits(10));//true

    }

}
