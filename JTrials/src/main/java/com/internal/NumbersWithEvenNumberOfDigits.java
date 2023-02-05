package com.internal;

public class NumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int countEven = 0 ;
        for(int num : nums){
            if (digits(num)%2==0)
                countEven++;
        }
        return countEven;
    }
    private int digits(int num){
        if(num<10) {
            return 1;
        }else if(num < 100){
            return 2;
        }else if (num < 1000){
            return 3;
        }else if (num < 10000){
            return 4;
        }else if (num < 100000){
            return 5;
        }else {
            return 6;
        }
    }

    public static void main(String[] args) {
        System.out.println(new NumbersWithEvenNumberOfDigits().findNumbers(new int[]{12,345,2,6,7896}));
        System.out.println(new NumbersWithEvenNumberOfDigits().findNumbers(new int[]{555,901,482,1771}));
    }
}
