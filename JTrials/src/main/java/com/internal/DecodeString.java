package com.internal;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        // 3[a]2[bc]
        Stack<String> stack = new Stack<>();
        int sIndex = 0;
        StringBuffer sFinalBuf = new StringBuffer();
        StringBuffer sTempBuf = new StringBuffer();
        if(isAlphabet(s.charAt(sIndex))){
            int sNextIndex = getNextNonAlphabetLocation(s,sIndex);
            sFinalBuf.append(s.substring(sIndex, sNextIndex));
            sIndex = sNextIndex;
        }

        stack = populateStack(s, sIndex, stack);
        return null;
    }
    private Stack<String> populateStack(String s, int sIndex, Stack<String> stack){
        int sNextIndex;
        while(sIndex < s.length()){
            if(sIndex < s.length() && isDigit(s.charAt(sIndex))) {
                sNextIndex = getNextNonDigitLocation(s, sIndex);
                int occurrences = Integer.parseInt(s.substring(sIndex, sNextIndex));
                sIndex = sNextIndex;
                stack.push("" + occurrences);
            }
            if(sIndex < s.length() && isBracket(s.charAt(sIndex))) {
                if(s.charAt(sIndex)==']'){
                    if(isAlphabet(stack.peek().charAt(0))){
                        String alph = stack.pop();
                        if(isBracket(stack.peek().charAt(0))){
                            stack.pop();
                        }
                        if(isDigit(stack.peek().charAt(0))) {
                            int occ = Integer.parseInt(stack.pop());
                            stack.push(extrapolate(alph,occ));
                        }else{
                            stack.push(stack.pop()+alph);
                        }

                    //}else{
                        stack.push(""+s.charAt(sIndex));
                    }
                }else{
                    stack.push(""+s.charAt(sIndex));
                }
                sIndex++;
            }
            if(sIndex < s.length() && isAlphabet(s.charAt(sIndex))) {
                sNextIndex = getNextNonAlphabetLocation(s, sIndex);
                stack.push(s.substring(sIndex, sNextIndex));
                sIndex = sNextIndex;
            }
        }
        return stack;
    }
    private String extrapolate(String s, int times){
        StringBuffer sBuf = new StringBuffer();
        for(int i=0;i<times;i++){
            sBuf.append(s);
        }
        return sBuf.toString();
    }
    private boolean isBracket(char c){
        return c=='[' || c ==']';
    }
    private boolean isAlphabet(char c){
        return c >= 'a' && c <= 'z';
    }
    private boolean isDigit(char c){
        return c >= '0' && c <= '9';
    }
    private int getNextNonDigitLocation(String s, int index){
        while(s.charAt(index) >= '0' && s.charAt(index)<='9')
            index++;
        return index;
    }
    private int getNextNonAlphabetLocation(String s, int index){
        while(s.charAt(index) >= 'a' && s.charAt(index)<='z')
            index++;
        return index;
    }

    public static void main(String[] args) {
        /*new DecodeString().decodeString("abc32[d]");
        new DecodeString().decodeString("3[add]");*/
        new DecodeString().decodeString("3[add4[xy2[n]z]]");
    }
}
