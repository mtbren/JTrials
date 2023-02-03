package com.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LongestPalindrome {
    private static int longestPalindrome(String s) {
        Map<Character, Integer> occurrences = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if(occurrences.containsKey(s.charAt(i))){
                occurrences.replace(s.charAt(i),occurrences.get(s.charAt(i))+1);
            }else{
                occurrences.put(s.charAt(i),1);
            }
        }

        int biggestOdd = 0;
        int totalCount = 0;
        Iterator iter = occurrences.keySet().iterator();
        while(iter.hasNext()){
            Character key = (Character)iter.next();
            if(occurrences.get(key) % 2 == 0)
                totalCount += occurrences.get(key);
            else {
                totalCount += occurrences.get(key)-1;
                if (biggestOdd < occurrences.get(key)) {
                    biggestOdd = occurrences.get(key);
                }
            }
        }
        if(biggestOdd > 0)
            totalCount += 1;
        return totalCount;
    }

    public static void main(String[] args) {
        /*System.out.println(longestPalindrome("abccccdd")); //7
        System.out.println(longestPalindrome("a")); //1
        System.out.println(longestPalindrome("bb")); //2*/
        System.out.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceive" +
                "dandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpat" +
                "eaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmigh" +
                "tliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicateweca" +
                "nnotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehavecons" +
                "ecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongremember" +
                "whatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedher" +
                "etotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustob" +
                "eherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreasedd" +
                "evotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvet" +
                "hatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomand" +
                "thatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));

    }
}
