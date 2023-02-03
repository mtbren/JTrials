package com.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XOfAKindInDeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length == 1)
            return false;
        if(deck.length == 2)
            return deck[0]==deck[1];

        Map<Integer, Integer> occurrences =
                new HashMap<Integer, Integer>();
        for(int i=0;i<deck.length;i++){
            if(occurrences.keySet().contains(deck[i])){
                occurrences.put(deck[i],occurrences.get(deck[i])+1);
            }else{
                occurrences.put(deck[i],1);
            }
        }
        //int[] deckOccur = new int[1000]{};
        List<Integer> myList = new ArrayList<Integer>();
        for(int key:occurrences.keySet()){
            //deckOccur[key]=occurrences.get(key);
            myList.add(occurrences.get(key));
        }
        for(int i=2;i<5000;i++){
            boolean div = true;
            for(int j=0;j<myList.size();j++){
                if(myList.get(j)%i==0)
                    div=true;
                else {
                    div = false;
                    break;
                }
                if(j== myList.size()-1 && div==true)
                    return true;

            }
        }

        return false;
    }

    public static void main(String[] args) {
        XOfAKindInDeckOfCards x = new XOfAKindInDeckOfCards();
        System.out.println(x.hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1}));//true
        System.out.println(x.hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3}));//false
        System.out.println(x.hasGroupsSizeX(new int[]{1,1,2,2,2,2}));//true
    }
}
