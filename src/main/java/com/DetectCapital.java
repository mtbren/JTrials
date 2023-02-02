package com;

public class DetectCapital {
    private static boolean isCorrectCapital(String str){
        boolean allRemainingUpper=true;
        boolean firstUpper=false;
        boolean allRemainingLower=true;

        if(str.charAt(0)>='A' && str.charAt(0)<='Z') {
            firstUpper = true;
        }

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                allRemainingUpper=false;
            }else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                allRemainingLower=false;
            }
        }

        if(firstUpper) {
            if(allRemainingUpper || allRemainingLower) {
                return true;
            }else{
                return false;
            }
        }else if(allRemainingLower){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isCorrectCapital("USA"));    //true
        System.out.println(isCorrectCapital("google")); //true
        System.out.println(isCorrectCapital("Yahoo"));  //true
        System.out.println(isCorrectCapital("uSa"));    //false

        System.out.println(isCorrectCapital("FlaG"));    //false
    }
}
