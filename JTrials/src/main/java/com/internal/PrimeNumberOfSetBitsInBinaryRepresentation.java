package com.internal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public static int countPrimeSetBits(int left, int right) {
        if(left==right && left==1)
            return 0;
        int[] primeNosUnder32Arr = new int[]{2,3,5,7,11,13,17,19,23,29,31};
        Set<Integer> primeNosUnder32Set = new HashSet<Integer>();
        Arrays.stream(primeNosUnder32Arr).forEach(item ->
                primeNosUnder32Set.add(item));

        String binaryRep ;
        int countOfNosWithPrimeBits=0;
        if(left == 1)
            left = 2;
        for(int i=left;i<=right;i++){
            binaryRep = Integer.toBinaryString(i).replace("0","");
            if(primeNosUnder32Set.contains(binaryRep.length())){
                countOfNosWithPrimeBits++;
            }
        }

        return countOfNosWithPrimeBits;
    }

    public static void main(String[] args) {
        //System.out.println(countPrimeSetBits(6,10));
        //System.out.println(countPrimeSetBits(10,15));
        System.out.println(countPrimeSetBits(1,2));
    }
}
