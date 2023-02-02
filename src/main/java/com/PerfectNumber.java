package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PerfectNumber {
    private static boolean isPerfectNumber(int n) {
        if (n < 2) {
            return false;
        }
        Set<Integer> factors = new LinkedHashSet<Integer>();
        int factorAddition = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (!factors.contains(i)) {
                    factors.add(i);
                    factors.add(n / i);

                    factorAddition += i;
                    factorAddition += (n / i);
                }
            }


        }
        factors.add(1);
        factorAddition += 1;

        return factorAddition == n;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); // true
        System.out.println(isPerfectNumber(7)); // false
        System.out.println(isPerfectNumber(28)); //true
        System.out.println(isPerfectNumber(8128));  //true
        System.out.println(isPerfectNumber(496));  //true
        System.out.println(isPerfectNumber(2));  //false


    }

}
