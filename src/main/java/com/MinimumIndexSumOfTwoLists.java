package com;

import java.util.*;

public class MinimumIndexSumOfTwoLists {
    private static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> mapIndex1 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            mapIndex1.put(list1[i], i+1);
        }

        Map<String, Integer> mapIndex2 = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            mapIndex2.put(list2[i], i+1);
        }

        Iterator<String> iter = mapIndex1.keySet().iterator();
        String temp;
        Map<Integer,List<String>> mapList = new HashMap();
        while(iter.hasNext()){
            temp= iter.next();
            if(mapIndex2.containsKey(temp)){
                if(!mapList.containsKey(mapIndex1.get(temp)+mapIndex2.get(temp))) {
                    mapList.put(mapIndex1.get(temp) + mapIndex2.get(temp), new ArrayList<String>() );
                }
                mapList.get(mapIndex1.get(temp) + mapIndex2.get(temp)).add(temp);
            }
        }

        Optional<Integer> min = mapList.keySet().stream().sorted().findFirst();

        String[] strArr = new String[mapList.get(min.get()).size()];
        for(int i=0;i<mapList.get(min.get()).size();i++){
            strArr[i] = mapList.get(min.get()).get(i);
        }

        return strArr;
    }

    public static void main(String[] args) {
        findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"});

    }
}
