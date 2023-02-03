package com.internal;

import java.util.*;

public class FindAllAnagramsOfString {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> retList = new ArrayList<Integer>();
        if(p.length() > s.length())
            return retList;
        if(s.equals(p)){
            retList.add(0);
            return retList;
        }
        HashMap<Character,Integer> mySlidingMap =
                new HashMap<Character, Integer>();
        HashMap<Character,Integer> myStaticMap =
                new HashMap<Character, Integer>();

        for(int i=0;i<p.length();i++){
            if(!mySlidingMap.containsKey(s.charAt(i))) {
                mySlidingMap.put(s.charAt(i), 1);
            }else{
                mySlidingMap.put(s.charAt(i), mySlidingMap.get(s.charAt(i))+1);
            }
            if(!myStaticMap.containsKey(p.charAt(i))) {
                myStaticMap.put(p.charAt(i), 1);
            }else{
                myStaticMap.put(p.charAt(i), myStaticMap.get(p.charAt(i))+1);
            }
        }
        for(int i=0, j=p.length()-1;j<s.length();){
            boolean allPresent = true;
            for(Character key : myStaticMap.keySet()){
                if(!mySlidingMap.containsKey(key) ||
                        myStaticMap.get(key)>mySlidingMap.get(key)){
                    allPresent = false;
                    break;
                }
            }
            if(allPresent){
                retList.add(i);
            }
            i++;j++;
            if(j==s.length())
                break;
            if(s.charAt(i-1) != s.charAt(j)) {
                mySlidingMap.put(s.charAt(i - 1),
                        mySlidingMap.get(s.charAt(i - 1)) - 1);
                if (!mySlidingMap.containsKey(s.charAt(j))) {
                    mySlidingMap.put(s.charAt(j), 1);
                } else {
                    mySlidingMap.put(s.charAt(j), mySlidingMap.get(s.charAt(j)) + 1);
                }
            }

        }
        return retList;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd","abc"));//[0,6]
        System.out.println(findAnagrams("abab","ab"));//[0,1,2]
        System.out.println(findAnagrams("abab","abab"));//[0]
        System.out.println(findAnagrams("abab","ababc"));//[]
        System.out.println(findAnagrams("cbacabcba","abc"));//[0,1,3,4,6]
        /*StringBuilder s = new StringBuilder();
        StringBuilder p = new StringBuilder();
        for(int i=0;i<10000;i++){
            s.append("a");
            p.append("a");
        }
        for(int i=0;i<10000;i++){
            s.append("a");
        }
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        List<Integer> list = findAnagrams(s.toString(), p.toString());
        lt = LocalTime.now();
        System.out.println(lt);
        System.out.println();

        lt = LocalTime.now();
        System.out.println(lt);
        List<Integer> list1 = findAnagrams1(s.toString(), p.toString());
        lt = LocalTime.now();
        System.out.println(lt);
        System.out.println();*/
    }
    public static List<Integer> findAnagrams1(String s, String p) {
        List<Integer> retList = new ArrayList<Integer>();
        if(p.length() > s.length())
            return retList;
        if(s.equals(p)){
            retList.add(0);
            return retList;
        }
        Set<Integer> iSet = new HashSet<Integer>();
        for(int i=0;i<s.length()-p.length()+1;i++){
            if(p.equals(s.substring(i,i+p.length()))){
                iSet.add(i);
            }
        }

        int registerI = -1;
        StringBuilder pBldr = new StringBuilder(p);
        for(int i=0;i<s.length()-p.length()+1;i++){
            if(iSet.contains(i)){
                retList.add(i);
                continue;
            }
            if(pBldr.indexOf(""+s.charAt(i))>-1){
                registerI = i;
                pBldr = pBldr.deleteCharAt(pBldr.indexOf(""+s.charAt(i)));
                int j = i+1;
                while(s.length()>j && pBldr.indexOf(""+s.charAt(j))>-1){
                    pBldr = pBldr.deleteCharAt(pBldr.indexOf(""+s.charAt(j)));
                    j++;
                }

                if(pBldr.length()==0){
                    retList.add(registerI);
                }/*else{
                    i=j-1;
                }*/
                pBldr = new StringBuilder(p);
            }
        }
        return retList;
    }

}
