package com.internal;

public class StringAdjacentTwoDuplicateRemover {
    public static String removeDuplicatesFastest(String s) {
        char[] stack = new char[100001];
        int i=0, top = -1;
        while(i<s.length()){
            if(top<0){
                top++;
                stack[top]=s.charAt(i);
            }else{
                if(stack[top]==s.charAt(i)){
                    stack[top]=' ';
                    top--;
                }else{
                    top++;
                    stack[top]=s.charAt(i);
                }
            }
            i++;
        }


        StringBuilder strbldr = new StringBuilder();
        for(int j=0;j<top;j++){
            strbldr = strbldr.append(stack[j]);
        }
        return strbldr.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicatesFastest("abbbazzzc"));//abazc
        System.out.println(removeDuplicatesFastest("aac"));//c
        System.out.println(removeDuplicatesFastest("d"));//d
        System.out.println(removeDuplicatesFastest("azxxzy"));//ay
        System.out.println(removeDuplicatesFastest("abbaca"));//ca
        System.out.println(removeDuplicatesFastest("aaaaaaaaa"));//a
        System.out.println(removeDuplicatesFastest("aaaaaaaa"));//

    }

    public static String removeDuplicatesFaster(String s) {
        String orig = s;
        s = s.replace("aa", "").replace("bb", "").replace("cc", "")
                .replace("dd", "").replace("ee", "").replace("ff", "")
                .replace("gg", "").replace("hh", "").replace("ii", "")
                .replace("jj", "").replace("kk", "").replace("ll", "")
                .replace("mm", "").replace("nn", "").replace("oo", "")
                .replace("pp", "").replace("qq", "").replace("rr", "")
                .replace("ss", "").replace("tt", "").replace("uu", "")
                .replace("vv", "").replace("ww", "").replace("xx", "")
                .replace("yy", "").replace("zz", "");
        if (s.length() == orig.length())
            return s;
        else
            return removeDuplicatesFaster(s);
    }

    public static String removeDuplicates(String s) {
        StringBuffer sBuf = new StringBuffer();
        int curr = 0, next = 1;
        if (s.length() <= 1)
            return s;
        while (next < s.length()) {
            while (next < s.length() && s.charAt(curr) == s.charAt(next)) {
                next += 2;
                curr += 2;
            }
            if (curr >= s.length()) {
                break;
            }
            sBuf = sBuf.append(s.charAt(curr));
            curr++;
            next++;
            if (next == s.length()) {
                sBuf = sBuf.append(s.charAt(curr));
            }

        }

        if (s.length() != sBuf.toString().length()) {
            return removeDuplicates(sBuf.toString());
        } else {
            return sBuf.toString();
        }
    }


}
