package com;

import java.util.Arrays;

public class ContructRectangle {
    public static int[] constructRectangle(int area) {
        int width=0, length=0;
        int sqrt = (int)Math.sqrt(area);
        if(sqrt*sqrt==area){
            width = sqrt;
            length = sqrt;
            return new int[]{length,width};
        }else if(sqrt==1){
            return new int[]{area,1};
        }
        int temp = sqrt;
        while(temp>=1){
            if(area % temp==0){
                width = Math.min(area/temp,temp);
                length = Math.max(area/temp,temp);
                break;
            }
            temp--;
        }
        return new int[]{length,width};
    }

    public static void main(String[] args) {
        Arrays.stream(constructRectangle(6)).forEach(i->System.out.print(i+" "));
        System.out.println();

        Arrays.stream(constructRectangle(4)).forEach(i->System.out.print(i+" "));
        System.out.println();
        Arrays.stream(constructRectangle(37)).forEach(i->System.out.print(i+" "));
        System.out.println();
        Arrays.stream(constructRectangle(122122)).forEach(i->System.out.print(i+" "));
        System.out.println();
        Arrays.stream(constructRectangle(10000000)).forEach(i->System.out.print(i+" "));
        System.out.println();
        Arrays.stream(constructRectangle(1)).forEach(i->System.out.print(i+" "));
        System.out.println();
        Arrays.stream(constructRectangle(2)).forEach(i->System.out.print(i+" "));
        System.out.println();


    }
}
