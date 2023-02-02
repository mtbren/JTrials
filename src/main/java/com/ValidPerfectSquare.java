package com;

public class ValidPerfectSquare {
    private static boolean isPerfectSquare(int num) {

        int orig = num;
        if(num == 1)
            return true;
        
        while(true){
            num = num/2;
            if(num > orig/num)
                continue;
            else if(num == orig/num && orig%num ==0)
                return true;
            else //if(num < orig/num)
                break;
        }
        while(true){
            if(num < orig/num)
                num++;
            else if(num == orig/num && orig%num ==0)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(7));
        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(2147483647));
    }
}
