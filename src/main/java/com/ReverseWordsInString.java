package com;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        s = s.trim();

        while(true){
            if(s.contains("  "))
                s = s.replace("  "," ");
            else
                break;
        }

        if(s.lastIndexOf(" ") < 1)
            return s;
        StringBuffer sBuf = new StringBuffer();
        int leftIndex = s.lastIndexOf(" ");
        int rightIndex = s.length();
        List<String> retList = new ArrayList<String>();
        while(leftIndex>=0){
            retList.add(s.substring(leftIndex, rightIndex).trim());
            rightIndex = leftIndex ;
            s = s.substring(0,rightIndex);
            leftIndex = s.lastIndexOf(" ");
        }
        retList.add(s.substring(0,rightIndex));
        StringBuffer retString = new StringBuffer();
        for(String str : retList){
            retString.append(str+" ");
        }
        return retString.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWordsInString rws = new ReverseWordsInString();
        System.out.println(
                rws.reverseWords("the sky is blue"));
        System.out.println(
                rws.reverseWords("  hello world  "));
        System.out.println(
                rws.reverseWords("  hello   world  "));
    }
}
