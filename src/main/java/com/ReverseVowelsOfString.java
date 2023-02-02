package com;

public class ReverseVowelsOfString {
    private static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0, right = s.length() - 1;
        while(left < right){
            if(isVowel(s.charAt(left)) && !isVowel(s.charAt(right))){
                right--;
            }else if(!isVowel(s.charAt(left)) && isVowel(s.charAt(right))){
                left++;
            }else if (isVowel(s.charAt(left)) && isVowel(s.charAt(right))){
                sb.setCharAt(left,s.charAt(right));
                sb.setCharAt(right,s.charAt(left));
                left++;
                right--;
            }else{
                left++;
                right--;
            }
        }
        return sb.toString();
    }
    private static boolean isVowel(char c){
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ||
            c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
