package com;

import java.util.ArrayList;
import java.util.List;

public class ValidWordSquare {
    private static boolean validWordSquare(List<String> words) {
        try {
            for (int i = 0; i < words.size(); i++) {
                for (int j = i + 1; j < words.get(i).length(); j++) {
                    if (words.get(i).charAt(j) != words.get(j).charAt(i))
                        return false;
                }
            }

            for (int i = words.size() - 1; i > -1; i--) {
                for (int j = words.get(i).length() - 1; j > -1; j--) {
                    if (words.get(i).charAt(j) != words.get(j).charAt(i))
                        return false;
                }
            }
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("ball");words.add("asee");words.add("let");words.add("lep");
        System.out.println(validWordSquare(words));
    }
}
