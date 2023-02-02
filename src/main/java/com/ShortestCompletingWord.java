package com;

import java.util.Arrays;

public class ShortestCompletingWord {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.replace(" ","").replace("0","")
                .replace("1","").replace("2","").replace("3","")
                .replace("4","").replace("5","").replace("6","")
                .replace("7","").replace("8","").replace("9","");

        licensePlate = sortString(licensePlate);
        //int[] lengths = new int[words.length];
        String word;
        int leastLengthMatch = Integer.MAX_VALUE, indexLeastLengthMatch=0;
        for(int i=0;i< words.length;i++){
            word = sortString(words[i]);
            if(licensePlate.contains(word) && word.length()<leastLengthMatch){
                leastLengthMatch = word.length();
                indexLeastLengthMatch = i;
            }
        }
        return words[indexLeastLengthMatch];
    }
    public static String sortString(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        StringBuilder s = new StringBuilder();
        for(int i=0;i<arr.length; i++){
            s=s.append(arr[i]);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("1s3 PSt",
                new String[]{"step","steps","stripe","stepple"}));
    }
}
