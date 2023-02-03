package com.internal;

import java.util.HashMap;
import java.util.Map;

public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> billsMap = new HashMap<Integer, Integer>();
        billsMap.put(5,0); billsMap.put(10,0); billsMap.put(20,0);

        for(int i=0;i<bills.length;i++){
            if(bills[i] == 5) {
                billsMap.put(5, billsMap.get(5) + 1);
            }else if (bills[i] == 10) {
                if(billsMap.get(5)>0){
                    billsMap.put(5, billsMap.get(5)-1);
                    billsMap.put(10, billsMap.get(10)+1);
                }else{
                    return false;
                }
            }else if (bills[i] == 20){
                if(billsMap.get(10)>0 && billsMap.get(5)>0){
                    billsMap.put(5, billsMap.get(5)-1);
                    billsMap.put(10, billsMap.get(10)-1);
                    billsMap.put(20, billsMap.get(20)+1);
                }else if(billsMap.get(5)>2){
                    billsMap.put(5, billsMap.get(5)-3);
                    billsMap.put(20, billsMap.get(20)+1);
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,5,10,20}));//true
        System.out.println(lemonadeChange(new int[]{5,5,10,10,20}));//false
        System.out.println(lemonadeChange(new int[]{20}));//false
        System.out.println(lemonadeChange(new int[]{10}));//false
        System.out.println(lemonadeChange(new int[]{5,10}));//true

    }
}
