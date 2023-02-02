package com;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int ptr = num.length-1;
        int carry = 0;
        while(ptr>=0 && k>0){
            int addition = num[ptr]+k;
            num[ptr] = addition % 10;
            k=addition/10;
            ptr--;
        }
        List<Integer> retList = new ArrayList<Integer>();
        if(ptr < 0 && k!=0){
            String kStr = Integer.toString(k);
            for(int i=0;i<kStr.length();i++){
                retList.add(Integer.parseInt(""+kStr.charAt(i)));
            }
        }


        if(carry > 0)
            retList.add(carry);
        for(int i= 0;i<num.length;i++){
            retList.add(num[i]);
        }
        return retList;
    }

    public static void main(String[] args) {
        System.out.println(new AddToArrayFormOfInteger().
                        addToArrayForm(new int[]{1,2,3,4}, 4));
        System.out.println(new AddToArrayFormOfInteger().
                addToArrayForm(new int[]{1,2,3,7}, 4));
        System.out.println(new AddToArrayFormOfInteger().
                addToArrayForm(new int[]{1,2,9,7}, 4));
        System.out.println(new AddToArrayFormOfInteger().
                addToArrayForm(new int[]{9,9,9,7}, 4));
        System.out.println(new AddToArrayFormOfInteger().
                addToArrayForm(new int[]{7}, 99));
        System.out.println(new AddToArrayFormOfInteger().
                addToArrayForm(new int[]{7}, 777));
        System.out.println(new AddToArrayFormOfInteger().
                addToArrayForm(new int[]{7,7,7}, 7));
        System.out.println(new AddToArrayFormOfInteger().
                addToArrayForm(new int[]{7,7,7}, 77));
        System.out.println(new AddToArrayFormOfInteger().
                addToArrayForm(new int[]{7,7,7}, 0));
        System.out.println(new AddToArrayFormOfInteger().
                addToArrayForm(new int[]{0}, 999));
    }

}
