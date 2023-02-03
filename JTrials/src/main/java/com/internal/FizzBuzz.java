package com.internal;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                list.add("" + i);
            }else if(i % 5 == 0) {
                if(i %3 == 0)
                    list.add("FizzBuzz");
                else
                    list.add("Buzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            }

            /*if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add("" + i);
            }*/
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }
}
