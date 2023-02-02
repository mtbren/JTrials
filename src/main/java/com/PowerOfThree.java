package com;

public class PowerOfThree {
    private static boolean isPowerOfThree(int n) {
        if(n==0)
            return false;

        while(n>=3){
            if(n%3==0)
                n=n/3;
            else
                break;
        }
        if(n==1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(6));
        System.out.println(isPowerOfThree(81));
    }
}
