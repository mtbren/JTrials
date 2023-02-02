package com;

public class FlippingAnImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] retImage = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++){
                retImage[i][j]=image[i][image[i].length -1 -j] ^ 1;
            }
        }
        return retImage;
    }

    public static void main(String[] args) {
        //flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}});
        //flipAndInvertImage(new int[][]{{1}});
        flipAndInvertImage(new int[][]{{1,1,0,0},{1,0,0,1},
                {0,1,1,1},{1,0,1,0}});
    }
}
