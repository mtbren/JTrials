package com;

public class MissingNumberInArithmeticProgression {
    public int missingNumber(int[] arr) {
        int step = (arr[arr.length-1] - arr[0])/arr.length ;

        for(int i=1;i< arr.length;i++)
            if(arr[i] != arr[i-1]+step)
                return arr[i-1]+step;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new MissingNumberInArithmeticProgression()
                .missingNumber(new int[]{5,7,11,13}));
        System.out.println(new MissingNumberInArithmeticProgression()
                .missingNumber(new int[]{15,13,12}));
    }
}
