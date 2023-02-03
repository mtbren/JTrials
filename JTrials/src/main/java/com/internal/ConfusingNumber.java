package com.internal;

public class ConfusingNumber {
    public boolean confusingNumber(int n) {
        int origN = n;
        int invertedNumber = 0;
        String nStr = String.valueOf(n);
        int nLength = nStr.length();
        StringBuffer invertedStrBuf = new StringBuffer();
        int currentPow = 1;
        for(int i = 0; i< nLength;i++){
            int rem = n % 10;
            int invertedDigit = returnInvertedInt(rem);
            if( invertedDigit != -1 ){
                invertedNumber = invertedNumber +
                        invertedDigit * (int)Math.pow(10, nLength-currentPow);
            }else{
                return false;
            }
            n = n / 10;
            currentPow ++ ;
        }
        //System.out.println("Inverted Number = "+ invertedNumber);
        return (origN != invertedNumber);
    }
    private int returnInvertedInt(int n){
        if(n == 2 || n == 3 || n == 4 || n == 5  || n == 7){
            return -1;
        }else if (n == 8 || n ==0 || n == 1){
            return n;
        }else if (n == 6){
            return 9;
        }else if (n == 9){
            return 6;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new ConfusingNumber().confusingNumber(79));
        System.out.println(new ConfusingNumber().confusingNumber(1));
        System.out.println(new ConfusingNumber().confusingNumber(10));
        System.out.println(new ConfusingNumber().confusingNumber(68));
        System.out.println(new ConfusingNumber().confusingNumber(6));
        System.out.println(new ConfusingNumber().confusingNumber(89));
        System.out.println(new ConfusingNumber().confusingNumber(11));
    }
}
