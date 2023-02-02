package com;

import java.util.HashMap;
import java.util.Map;

public class WordsThatCanbeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> charOccurrences =
                new HashMap<Character,Integer>();
        for(int i=0;i<chars.length();i++){
            if(charOccurrences.containsKey(chars.charAt(i)))
                charOccurrences.put(chars.charAt(i),
                        charOccurrences.get(chars.charAt(i))+1);
            else
                charOccurrences.put(chars.charAt(i),1);
        }
        int totalReturnWordsLength = 0;
        for(String word : words){
            Map<Character,Integer> wordCharOccurrences =
                    new HashMap<Character,Integer>();
            if(word.length() > chars.length())
                continue;
            for(int i=0;i<word.length();i++) {
                if(charOccurrences.containsKey(word.charAt(i))){
                    if (wordCharOccurrences.containsKey(word.charAt(i))) {
                        if(wordCharOccurrences.get(word.charAt(i))+1 <=
                                charOccurrences.get(word.charAt(i)))
                            wordCharOccurrences.put(word.charAt(i),
                                wordCharOccurrences.get(word.charAt(i)) + 1);
                        else
                            break;
                    }else if(!wordCharOccurrences.containsKey(word.charAt(i)) &&
                            1 <= charOccurrences.get(word.charAt(i))) {
                        wordCharOccurrences.put(word.charAt(i), 1);
                    }else{
                        break;
                    }
                }else{
                    break;
                }
                if(i == word.length()-1) {
                    totalReturnWordsLength += word.length();
                    //System.out.println(word);
                }
            }
        }
        return totalReturnWordsLength;
    }

    public static void main(String[] args) {
        WordsThatCanbeFormedByCharacters wcfc =
                new WordsThatCanbeFormedByCharacters();
        System.out.println(wcfc.countCharacters(
                new String[]{"cat","bt","hat","tree"},"atach"));
        System.out.println(wcfc.countCharacters(
                new String[]{"hello","world","leetcode"},
                "welldonehoneyr"));
        System.out.println(wcfc.countCharacters(
                new String[]{"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin",
                        "ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb",
                        "ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl",
                        "boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx",
                        "nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop",
                        "hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx",
                        "juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr",
                        "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl",
                        "tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp",
                        "qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv",
                        "sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz",
                        "yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue",
                        "hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo",
                        "teyygdmmyadppuopvqdodaczob",
                        "qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs",
                        "qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"},
                "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp"));
    }
}
