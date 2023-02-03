package com.internal;

import java.util.*;

public class SentenceSimilarity {
    public static boolean areSentencesSimilar(String[] sentence1, String[] sentence2,
                                       List<List<String>> similarPairs) {
        if(sentence1.length != sentence2.length)
            return false;

        Map<String, HashSet<String>> similarPairsMap = new HashMap<String, HashSet<String>>();
        similarPairs.forEach(pair -> {
            if(!similarPairsMap.containsKey(pair.get(0))){
                similarPairsMap.put(pair.get(0), new HashSet<String>());
            }
            similarPairsMap.get(pair.get(0)).add(pair.get(1));

            if(!similarPairsMap.containsKey(pair.get(1))){
                similarPairsMap.put(pair.get(1), new HashSet<String>());
            }
            similarPairsMap.get(pair.get(1)).add(pair.get(0));
        });

        for(int i=0;i<sentence1.length;i++){
            if(sentence1[i].equals(sentence2[i])){
                continue;
            }else{
                if(similarPairsMap.containsKey(sentence1[i]) &&
                    similarPairsMap.get(sentence1[i]).contains(sentence2[i])){
                    continue;
                }else if(similarPairsMap.containsKey(sentence2[i]) &&
                        similarPairsMap.get(sentence2[i]).contains(sentence1[i])){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }


}
