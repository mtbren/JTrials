package com.internal;

import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram {

    public String[] findOcurrences(String text, String first, String second) {
        String[] textArr = text.split(" ");
        List<String> thirdLiist = new ArrayList<String>();

        for (int i = 1; i < textArr.length; i++) {
            if(textArr[i-1].equals(first) &&
                    textArr[i].equals(second)){
                if(i+1 < textArr.length){
                    thirdLiist.add(textArr[i+1]);
                }
            }
        }

        return  thirdLiist.toArray(new String[0]);
    }

    public static void main(String[] args) {
        new OccurrencesAfterBigram().findOcurrences(
                "alice is a good girl she is a good student",
                "a","good"
        );
        new OccurrencesAfterBigram().findOcurrences(
                "we will we will rock you",
                "we","will"
        );
    }
}
