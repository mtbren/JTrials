package com;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class AnagramValidator {
    private static boolean isAnagramFaster(String s, String t){
        if(s.length() != t.length())
            return false;

        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 97] = arr[s.charAt(i) -97] + 1;
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i) - 97] = arr[t.charAt(i) -97] - 1;
        }

        for(int i=0;i<26;i++){
            if(arr[i] != 0)
                return false;
        }
        return true;
    }
    private static boolean isAnagram(String s, String t) {
        Map<String,Integer> charCount = new HashMap<String,Integer>();
        Integer temp;
        if(s.length() != t.length())
            return false;

        for(int i=0;i<s.length();i++){
            if(charCount.containsKey(""+s.charAt(i)))
                charCount.replace(""+s.charAt(i),charCount.get(""+s.charAt(i))+1);
            else
                charCount.put(""+s.charAt(i),1);
        }
        for(int i=0;i<t.length();i++){
            temp = charCount.get(""+t.charAt(i));
            if(temp == null || temp == 0)
                return false;
            else if (temp==1)
                charCount.remove(""+t.charAt(i));
            else
                charCount.replace(""+t.charAt(i),charCount.get(""+t.charAt(i))-1);
        }

        if(charCount.keySet().size()==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagramFaster("rat","tra"));
        System.out.println(isAnagramFaster("rat","trz"));
        int a = 'a';
        System.out.println(a);
    }
}
