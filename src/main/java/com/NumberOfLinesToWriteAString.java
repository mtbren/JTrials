package com;

public class NumberOfLinesToWriteAString {
    public static int[] numberOfLines(int[] widths, String s) {
        int noOfLines = 1;
        int currentLinePixelWidth = 0;
        int inta = 'a';
        for (int i = 0; i < s.length(); i++) {
            if(currentLinePixelWidth + widths[s.charAt(i)-inta] > 100){
                noOfLines++;
                currentLinePixelWidth = widths[s.charAt(i)-inta];
            }else{
                currentLinePixelWidth += widths[s.charAt(i)-inta];
            }
        }
        System.out.printf("%d, %d\n",noOfLines,currentLinePixelWidth);
        return new int[]{noOfLines,currentLinePixelWidth};
    }

    public static void main(String[] args) {
        numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                "abcdefghijklmnopqrstuvwxyz");
        numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                "bbbcccdddaaa");
    }

}
