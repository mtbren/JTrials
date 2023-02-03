package com.internal;

import java.util.*;

public class WordPattern {
    private static boolean wordPattern(String pattern, String s) {
        StringTokenizer strtkn = new StringTokenizer(s," ");
        Map<Character, String> sMap = new HashMap<Character, String>();
        Set<String> uniqueStrings = new HashSet<String>();
        String token;
        if(pattern.length() != strtkn.countTokens())
            return false;
        for(int i=0;i<pattern.length();i++){
            if(sMap.containsKey(pattern.charAt(i))){
                if(!sMap.get(pattern.charAt(i)).equals(strtkn.nextToken()))
                    return false;
            }else{
                token = strtkn.nextToken();
                if(uniqueStrings.add(token)) {
                    sMap.put(pattern.charAt(i), token);
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
        System.out.println(wordPattern("abba","dog cat cat fish"));
        System.out.println(wordPattern("aaaa","dog cat cat dog"));
        System.out.println(wordPattern("abba","dog dog dog dog"));
    }
}
