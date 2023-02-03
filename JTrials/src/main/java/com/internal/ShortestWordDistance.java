package com.internal;

public class ShortestWordDistance {
    private static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int shortDist = Integer.MAX_VALUE;
        int tempCounter1 = -1;
        int tempCounter2 = -1;
        for (int i = 0; i < wordsDict.length; i++) {
            if (word1.equals(wordsDict[i]) ) {
                tempCounter1 = i;
            }else if (word2.equals(wordsDict[i]) ) {
                tempCounter2 = i;
            }
            if(tempCounter1 > -1 && tempCounter2 > -1)
                shortDist = Math.min(shortDist, Math.abs(tempCounter1-tempCounter2));
        }
        return shortDist;
    }

    public static void main(String[] args) {
        System.out.println(shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},
                "practice","coding"));
        System.out.println(shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},
                "makes","coding"));
    }
}
