package com.internal;

public class XToThePowerOfN {
    public static double myPow(double x, int n) {
        if (x < 0.1 && x > -0.1 && n > 70)
            return 0;
        if(x==1)
            return 1;
        double pow = n > 0 ? x : 1 / x;

        if (n > 0) {
            long i;
            for (i = 2; i <= n; i *= 2) {
                pow = pow * pow;
            }
            if (i > n)
                i = i / 2;
            for (long j = i; j < n; j++) {
                pow = pow * x;
            }
        } else if (n < 0) {
            long i;
            for (i = -2; i >= n; i *= 2) {
                pow = (pow * pow);
            }
            if (i < n)
                i = i / 2;
            for (long j = i; j > n; j--) {
                pow = pow / x;
            }
        } else {
            return 1;
        }
        return pow;
    }

    public static void main(String[] args) {
        /*System.out.println(myPow(2.0, 2)); //4
        System.out.println(myPow(2.0, 3)); //8
        System.out.println(myPow(2.0, 4)); //16
        System.out.println(myPow(2.0, 5)); //32
        System.out.println(myPow(2.0, -2)); //0.25
        System.out.println(myPow(2.0, -3)); //0.125
        System.out.println(myPow(2.0, -9)); //0.125
        System.out.println(myPow(2.0, 10)); //1024
        System.out.println(myPow(2.1, 3)); //9.261*/
        System.out.println(myPow(2.00000,-2147483648));
    }


}
