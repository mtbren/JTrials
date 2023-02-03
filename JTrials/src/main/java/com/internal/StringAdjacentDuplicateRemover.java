package com.internal;

public class StringAdjacentDuplicateRemover {
    public static String removeDuplicates(String s) {
        StringBuffer sBuf = new StringBuffer();
        int currPtr=0, nextPtr=currPtr+1;

        if (s.length()==1)
            return s;
        while(currPtr<s.length() && nextPtr<s.length()){
            if(s.charAt(currPtr)!=s.charAt(nextPtr)){
                sBuf=sBuf.append(s.charAt(currPtr));
                currPtr++; nextPtr++;
            }else{
                while(nextPtr<s.length() &&
                        s.charAt(nextPtr)==s.charAt(currPtr)){
                    nextPtr++;
                }
                currPtr = nextPtr;
                nextPtr++;
            }
            if(currPtr==s.length()-1 && s.charAt(currPtr-1)!=s.charAt(currPtr)){
                sBuf=sBuf.append(s.charAt(currPtr));
            }
        }

        if(s.length() == sBuf.length()) {
           return sBuf.toString();
        }else{
            return removeDuplicates(sBuf.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbbazzzc"));//c
        System.out.println(removeDuplicates("aac"));//c
        System.out.println(removeDuplicates("d"));//d
        System.out.println(removeDuplicates("azxxzy"));//ay
        System.out.println(removeDuplicates("abbaca"));//ca


    }
}
