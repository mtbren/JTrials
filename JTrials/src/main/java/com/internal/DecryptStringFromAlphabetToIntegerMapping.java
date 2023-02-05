package com.internal;

import java.util.HashMap;
import java.util.Map;

public class DecryptStringFromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {
        StringBuffer sBuf = new StringBuffer(s);
        Map<String,Character> decodeMap1 = new HashMap<>();
        Map<String,Character> decodeMap2 = new HashMap<>();
        char charr = 'a';
        for(int i=1;i<10;i++){
            decodeMap1.put(""+i, charr++);
        }
        for(int i=10;i<=26;i++){
            decodeMap2.put(i+"#",charr++);
        }
        for(String key : decodeMap2.keySet()){
            s = s.replaceAll(key,""+decodeMap2.get(key));
        }
        for(String key : decodeMap1.keySet()){
            s = s.replaceAll(key,""+decodeMap1.get(key));
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new DecryptStringFromAlphabetToIntegerMapping().freqAlphabets("10#11#12"));
        System.out.println(new DecryptStringFromAlphabetToIntegerMapping().freqAlphabets("1326#"));
    }
}
