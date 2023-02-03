package com.internal;

import java.util.StringTokenizer;

public class CompareVersionNumbers {
    public static int compareVersion(String version1, String version2) {
        StringTokenizer v1 = new StringTokenizer(version1,".");
        StringTokenizer v2 = new StringTokenizer(version2,".");

        while(v1.hasMoreTokens() && v2.hasMoreTokens()){
            Integer v1Int = Integer.parseInt(v1.nextToken());
            Integer v2Int = Integer.parseInt(v2.nextToken());
            if(v1Int > v2Int){
                return 1;
            }else if (v1Int < v2Int){
                return -1;
            }
        }
        if(v1.hasMoreTokens() && !v2.hasMoreTokens()) {
            while(v1.hasMoreTokens())
                if(Integer.parseInt(v1.nextToken())>0)
                    return 1;
        }else if (!v1.hasMoreTokens() && v2.hasMoreTokens()){
            while(v2.hasMoreTokens())
                if(Integer.parseInt(v2.nextToken())>0)
                    return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("1.1.2","1.2.1"));//-1
        System.out.println(compareVersion("1.3.2","1.2.1"));//1
        System.out.println(compareVersion("1.2","1.2.1"));//-1
        System.out.println(compareVersion("1.3","1.2.1"));//1
        System.out.println(compareVersion("1.03","1.3.1"));//-1
        System.out.println(compareVersion("1.003","1.2.1"));//1
        System.out.println(compareVersion("0.1","1.1"));//-1
        System.out.println(compareVersion("1.0.1","1"));//1
        System.out.println(compareVersion("1","1.0.1"));//-1

        System.out.println(compareVersion("1.01","1.001"));//0
        System.out.println(compareVersion("1.0","1.00"));//0
        System.out.println(compareVersion("1.0","1.0.0"));//0


    }
}
