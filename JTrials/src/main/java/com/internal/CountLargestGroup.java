package com.internal;

import java.util.HashMap;
import java.util.Map;

public class CountLargestGroup {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> groups = new HashMap<>();

        for(int i=1;i<=n;i++){
            int sum = 0;
            int j = i;
            while(j>0){
                sum += j%10;
                j = j/10;
            }
            if(groups.containsKey(sum))
                groups.put(sum, groups.get(sum)+1);
            else
                groups.put(sum, 1);
        }
        int maxGroup = Integer.MIN_VALUE;
        int countMax = 0;
        for(Integer key : groups.keySet()){
            if(maxGroup < groups.get(key)){
                maxGroup = groups.get(key);
                countMax = 1;
            }else if (maxGroup == groups.get(key)){
                countMax ++;
            }else{

            }
        }
        return countMax;
    }

    public static void main(String[] args) {
        /*System.out.println(new CountLargestGroup().countLargestGroup(13)); //4
        System.out.println(new CountLargestGroup().countLargestGroup(2)); //2*/
        System.out.println(new CountLargestGroup().countLargestGroup(101)); //2
    }
}
