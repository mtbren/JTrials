package com;

import java.util.*;

public class BinaryWatch {
    private static List<String> readBinaryWatch(int turnedOn) {
        Map<Integer,List<String>> hours = new HashMap<Integer,List<String>>();
        List<String> oneList = new ArrayList<String>();
        oneList.add("1");oneList.add("2");oneList.add("4");oneList.add("8");

        List<String> twoList = new ArrayList<String>();
        twoList.add("3");twoList.add("5");twoList.add("9");
        twoList.add("6");twoList.add("10");

        List<String> threeList = new ArrayList<String>();
        threeList.add("7");threeList.add("11");

        List<String> zeroList = new ArrayList<String>();
        zeroList.add("0");

        hours.put(0,zeroList);
        hours.put(1,oneList);
        hours.put(2,twoList);
        hours.put(3,threeList);

        Map<Integer,List<String>> minutes = new HashMap<Integer,List<String>>();
        StringBuffer buf ;
        int count = 0;
        for(int i=0;i<60;i++){
            buf = new StringBuffer(Integer.toBinaryString(i));
            for(int j=0;j<buf.length();j++){
                if(buf.charAt(j)=='1')
                    count++;
            }
            if(minutes.containsKey(count)){
                minutes.get(count).add(i>9 ? ""+i : "0"+i);
            }else{
                minutes.put(count,new ArrayList<>());
                minutes.get(count).add(i>9 ? ""+i : "0"+i);
            }
            count=0;
        }

        List<String> finalList = new ArrayList<String>();
        List<String> hoursList;
        List<String> minsList;
        for(int h=0;h<=turnedOn;h++){
            if(hours.keySet().contains(h) && minutes.keySet().contains(turnedOn-h)){
                hoursList = hours.get(h);
                minsList = minutes.get(turnedOn-h);
                for(int i=0;i<hoursList.size();i++){
                    for(int j=0;j<minsList.size();j++){
                        finalList.add(hoursList.get(i)+":"+minsList.get(j));
                    }
                }
            }
        }


        return finalList;
    }

    public static void main(String[] args) {
        System.out.println(readBinaryWatch(9));
        System.out.println(readBinaryWatch(1));
        System.out.println(readBinaryWatch(2));
        System.out.println(readBinaryWatch(0));
    }
}
