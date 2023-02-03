package com.internal;

import java.util.HashMap;
import java.util.Map;

public class CountBinarySubstrings {
    public static int countBinarySubstrings(String s) {
        Map<Integer,Integer> mapp = new HashMap<Integer,Integer>();
        for(int i=0;i<s.length();i++){
            if(mapp.isEmpty()) {
                mapp.put(1, 1);
            }else{
                if(s.charAt(i)==s.charAt(i-1)){
                    mapp.put(mapp.keySet().size(), mapp.get(mapp.keySet().size())+1);
                }else{
                    mapp.put(mapp.keySet().size()+1,1);
                }
            }
        }

        int total = 0;
        for(int i=1;i<mapp.keySet().size();i++){
            total += Math.min(mapp.get(i),mapp.get(i+1));
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }

}
