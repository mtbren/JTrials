package com;

public class LicenseKeyFormatting {
    private static String licenseKeyFormatting(String s, int k) {
        StringBuffer strbuf = new StringBuffer();
        int tkCnt = 0;
        s=s.replaceAll("-","");
        //System.out.println(s);
        for(int i=s.length()-1;i>=0;i--){
            if(tkCnt==k) {
                strbuf.insert(0, '-');
                tkCnt=0;
                i++;
            }else{
                tkCnt++;
                strbuf.insert(0,(""+s.charAt(i)).toUpperCase());
            }

        }
        return strbuf.toString();
    }

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w",4));
        System.out.println(licenseKeyFormatting("2-5g-3-J",2));
    }
}
