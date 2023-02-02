package com;

import java.util.ArrayList;
import java.util.Locale;

public class KeyboardRow {
    private static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> finalArr = new ArrayList<>();
        boolean flag = true;
        for (int i = 0; i < words.length; i++) {
            if (containss(words[i].toLowerCase(Locale.ROOT), row1) ||
                    containss(words[i].toLowerCase(Locale.ROOT), row2) ||
                    containss(words[i].toLowerCase(Locale.ROOT), row3)){
                finalArr.add(words[i]);
            }
        }
        String [] retArr = new String[finalArr.size()];
        for(int i=0;i<finalArr.size();i++){
            retArr[i]=finalArr.get(i);
        }
        return retArr;
    }


    private static boolean containss(String word, String row) {
        for (int k = 0; k < word.length(); k++) {
            if (row.indexOf(word.charAt(k)) < 0) {
                return false;
            }
        }
        return true;
    }

}
