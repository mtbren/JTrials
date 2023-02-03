package com.internal;

public class ValidWordAbbreviation {
    private static boolean validWordAbbreviation(String word, String abbr) {
        int wPtr = 0, aPtr = 0;
        StringBuffer num ;
        StringBuffer abbrCopy = new StringBuffer();
        while (wPtr < word.length() && aPtr < abbr.length()) {
            if (word.charAt(wPtr)==abbr.charAt(aPtr)){
                abbrCopy.append(word.charAt(wPtr));
                wPtr++;
                aPtr++;
            }else if(abbr.charAt(aPtr)>='a'){
                return false;
            }else{
                num = new StringBuffer();
                while(aPtr < abbr.length() && abbr.charAt(aPtr)>='0' && abbr.charAt(aPtr)<='9'){
                    num.append(abbr.charAt(aPtr));
                    aPtr++;
                }
                if(num.length()>0) {
                    int skip = Integer.parseInt(num.toString());
                    if (wPtr + skip <= word.length() && skip > 0) {
                        abbrCopy.append(""+skip);
                        wPtr += skip;
                    }
                }
            }
        }
        if(abbrCopy.toString().equals(abbr) && wPtr==word.length() && aPtr==abbr.length())
            return true;
        return false;

    }

    public static void main(String[] args) {


        System.out.println(validWordAbbreviation("internationalization","i12iz4n"));// true
        System.out.println(validWordAbbreviation("internationalization","i5a11o1"));//true
        System.out.println(validWordAbbreviation("apple","a2e"));//false
        System.out.println(validWordAbbreviation("a","2"));//false
        System.out.println(validWordAbbreviation("a","01"));//false
        System.out.println(validWordAbbreviation("hi","1"));//false
        System.out.println(validWordAbbreviation("word","w0ord"));//false

    }
}
