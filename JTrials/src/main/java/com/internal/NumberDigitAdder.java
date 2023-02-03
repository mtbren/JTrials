package com.internal;

public class NumberDigitAdder {
    private static int addDigits(int num) {
        int tempSum = 0, finalSum;
        while(true) {
            tempSum=0;
            while (num > 9) {
                tempSum = tempSum + num % 10;
                num = num / 10;
            }
            tempSum = tempSum + num;
            if(tempSum > 9)
                num = tempSum;
            else break;
        }
        System.out.println(tempSum);
        return 0;
    }

    public static void main(String[] args) {
        addDigits(138);//3
        addDigits(38);//2
        addDigits(0);//2
    }
}
