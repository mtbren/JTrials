package com;

public class UglyNumber {
    private static boolean isUgly(int n) {
        if(n<=0)
            return false;

        while(true){
            if(n%5==0)
                n=n/5;
            else if(n%3==0)
                n=n/3;
            else if(n%2==0)
                n=n/2;
            else
                break;
        }
        /*while(true){
            if(n%3==0)
                n=n/3;
            else
                break;
        }
        while(true){
            if(n%2==0)
                n=n/2;
            else
                break;
        }*/

        if(Math.abs(n)>1)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(6));//true
        System.out.println(isUgly(8));//true
        System.out.println(isUgly(14));//false
        System.out.println(isUgly(1));//true
        System.out.println(isUgly(-2147483648));//false
        //System.out.println(Integer.MIN_VALUE);

    }
}
