package com.internal;

import java.util.*;

public class ShortestCompletingWord2 {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        Arrays.sort(words,
                (o1, o2) -> {return ((String)o1).length() - ((String)o2).length();});

        licensePlate = licensePlate.replace(" ","")
                .replace("1","").replace("0","")
                .replace("3","").replace("2","")
                .replace("5","").replace("4","")
                .replace("7","").replace("6","")
                .replace("9","").replace("8","");

        licensePlate = licensePlate.toLowerCase();

        String origLicensePlate = licensePlate;

        String currentWord;
        List<String> matching = new ArrayList<String>();
        for(int i=0;i< words.length;i++){
            currentWord = words[i];
            for(int j=0;j<licensePlate.length();j++){
                if(currentWord.replaceFirst(""+licensePlate.charAt(j),"").length() < currentWord.length()){
                    currentWord = currentWord.replaceFirst(""+licensePlate.charAt(j),"");
                }else{
                    break;
                }
                if(j==licensePlate.length()-1) {
                    matching.add(words[i]);
                    return words[i];
                }
            }
            //licensePlate = origLicensePlate;
        }
        /*int matchI, matchJ;
        for(int j=0;j< words.length;j++){
            for(int i=0;i<matching.size();i++){
                if(matching.get(i).equals(words[j])){
                    return words[j];
                }
            }
        }*/
        return null;
    }

    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("1s3 PSt",
                new String[]{"step","steps","stripe","stepple"}));
        System.out.println(shortestCompletingWord("1s3 456",
                new String[]{"looks","pest","stew","show"}));
    }
}
