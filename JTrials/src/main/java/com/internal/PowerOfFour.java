package com.internal;

public class PowerOfFour {
    private static boolean isPowerOfFour(int n) {
        String numStr = Integer.toBinaryString(n);
        if(numStr.lastIndexOf("1")==numStr.indexOf("1") &&
            numStr.lastIndexOf("1")==0 && numStr.length()%2==1)
            return true;
        return false;
    }

    private static boolean isPowerOfFourSlower(int n) {
        if(n==1)
            return true;
        else if(n<1)
            return false;
        else{
            int temp = 4;
            while(n>temp){
                temp = temp*4;
            }
            if(n==temp)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(1));//true
        System.out.println(isPowerOfFour(2));//false
        System.out.println(isPowerOfFour(0));//false
        System.out.println(isPowerOfFour(4));//true
        System.out.println(isPowerOfFour(16));//true
        System.out.println(isPowerOfFour(17));//false
        System.out.println(isPowerOfFour(-10));//false
    }
}
