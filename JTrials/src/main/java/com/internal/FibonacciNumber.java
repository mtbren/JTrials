package com.internal;

public class FibonacciNumber {
    // F(0) = 0
    // F(1) = 1
    // F(2) = F(1) + F(0) = 1 + 0 = 1
    private static int fFibonacci(int n){
        if(n==1) {
            return 1;
        }else if(n==0){
            return 0;
        }else{
            return fFibonacci(n-1)+fFibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fFibonacci(2)); //1
        System.out.println(fFibonacci(3)); //2
        System.out.println(fFibonacci(4)); //3
        System.out.println(fFibonacci(5)); //5
        System.out.println(fFibonacci(6)); //8
    }
}
