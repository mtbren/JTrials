package com;

import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumber {
    private static boolean isStrobogrammatic(String num) {
        Map<Character, Character> strMap  = new HashMap<Character,Character>();
        strMap.put('0','0');
        strMap.put('1','1');
        strMap.put('6','9');
        strMap.put('8','8');
        strMap.put('9','6');

        StringBuilder newNum = new StringBuilder();
        for(int i=0;i<num.length();i++){
            if(!strMap.containsKey(num.charAt(i)))
                return false;
            newNum.append(strMap.get(num.charAt(i)));
        }
        if(newNum.reverse().toString().equals(num))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isStrobogrammatic("69"));
        System.out.println(isStrobogrammatic("88"));
        System.out.println(isStrobogrammatic("962"));
        System.out.println(isStrobogrammatic("1"));
    }
}
