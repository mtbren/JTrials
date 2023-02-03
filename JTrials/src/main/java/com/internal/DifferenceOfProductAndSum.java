package com.internal;

import java.util.ArrayList;
import java.util.List;

public class DifferenceOfProductAndSum {
    public int subtractProductAndSum(int n) {
        List<Integer> nList = new ArrayList<>();

        while (n > 0) {
            int rem = n % 10;
            nList.add(rem);
            n = n / 10;
        }
        int product = 1;
        int sum = 0;
        for (int m : nList){
            product *= m;
            sum += m;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(new DifferenceOfProductAndSum().subtractProductAndSum(234));
        System.out.println(new DifferenceOfProductAndSum().subtractProductAndSum(4421));
    }
}
