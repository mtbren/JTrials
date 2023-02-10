package com.internal;

public class IncreasingDecreasingString {
    public String sortString(String s) {
        int[] alphabetOccurrences = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabetOccurrences[s.charAt(i)-'a'] ++;
        }
        boolean increasing = true;
        boolean decreasing = false;
        boolean foundOne = false;
        int ptr = 0;
        StringBuffer sBuf = new StringBuffer();
        while(true){
            if(alphabetOccurrences[ptr]>0){
                sBuf.append(Character.toChars('a'+ptr)[0]);
                foundOne = true;
                alphabetOccurrences[ptr] --;
            }
            if(increasing)
                ptr++;
            else
                ptr--;

            if(ptr == alphabetOccurrences.length-1 || ptr == 0){
                if(alphabetOccurrences[ptr]>0){
                    sBuf.append(Character.toChars('a'+ptr)[0]);
                    foundOne = true;
                    alphabetOccurrences[ptr]--;
                }
                if(!foundOne)
                    break;
                increasing = !increasing;
                decreasing = !decreasing;
                foundOne = false;
            }

        }

        return sBuf.toString();
    }

    public static void main(String[] args) {
        System.out.println(new IncreasingDecreasingString().sortString("aaaabbbbcccc"));
        System.out.println(new IncreasingDecreasingString().sortString("rat"));
    }
}
