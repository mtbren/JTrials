package com.internal;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> stonesMap = new HashMap<Character,Integer>();
        for(int i=0;i<stones.length();i++){
            if(!stonesMap.containsKey(stones.charAt(i))){
                stonesMap.put(stones.charAt(i),1);
            }else {
                stonesMap.put(stones.charAt(i),
                        stonesMap.get(stones.charAt(i))+1);
            }
        }
        int jewelCount=0;
        for(int i=0;i<jewels.length();i++){
            jewelCount = jewelCount +
                    ((stonesMap.get(jewels.charAt(i)) == null) ? 0 : stonesMap.get(jewels.charAt(i)));
        }
        return jewelCount;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
        System.out.println(numJewelsInStones("z","ZZ"));
    }
}
