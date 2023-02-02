package com;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        if(s.length()==1) return s;
        int leftPtr = 0, rightPtr = s.length()-1;
        char[] cArr = new char[s.length()];

        while(true){
            if(isAlphabet(s.charAt(leftPtr)) &&
                    isAlphabet(s.charAt(rightPtr))){
                cArr[leftPtr]=s.charAt(rightPtr);
                cArr[rightPtr]=s.charAt(leftPtr);
                leftPtr++;
                rightPtr--;
            }
            if(!isAlphabet(s.charAt(leftPtr))){
                cArr[leftPtr]=s.charAt(leftPtr);
                if(leftPtr==rightPtr-1){
                    cArr[rightPtr]=s.charAt(rightPtr);
                }
                leftPtr++;
            }
            if(!isAlphabet(s.charAt(rightPtr))){
                cArr[rightPtr]=s.charAt(rightPtr);
                if(leftPtr==rightPtr-1){
                    cArr[leftPtr]=s.charAt(leftPtr);
                }
                rightPtr--;
            }
            if(leftPtr==rightPtr){
                cArr[leftPtr]=s.charAt(rightPtr);
                break;
            }
            if(leftPtr>rightPtr){
                break;
            }
        }
        return new String(cArr);
    }
    private boolean isAlphabet(char c){
        if(c>=65 && c<=90)
            return true;
        if(c>=97 && c<=122)
            return true;
        return false;
    }

    public static void main(String[] args) {
        /*System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("ab-cde"));
        System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("ab-cd"));
        System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("a-bC-dEf-ghIj"));*/
        System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("Test1ng-Leet=code-Q!"));
        /*System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("-----"));
        System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("A"));
        System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("--"));
        System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("AB-"));
        System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("-AB"));*/
    }
}
