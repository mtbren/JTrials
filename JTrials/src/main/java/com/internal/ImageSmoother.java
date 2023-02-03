package com.internal;

public class ImageSmoother {
    public int[][] imageSmoother(int[][] img) {
        int sum = 0;
        int average, count;
        int[][] newImg = new int[img.length][img[0].length];

        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[i].length;j++){
                sum = img[i][j];
                count = 1;
                if(i!=img.length-1) {
                    sum += img[i + 1][j];
                    count++;
                }
                if(j!=img[i].length-1) {
                    sum += img[i][j + 1];
                    count++;
                }
                if(i!=0) {
                    sum += img[i - 1][j];
                    count++;
                }
                if(j!=0) {
                    sum += img[i][j - 1];
                    count++;
                }
                if(i!=img.length-1 && j!=img[i].length-1) {
                    sum += img[i + 1][j + 1];
                    count++;
                }
                if(i!=img.length-1 && j!=0) {
                    sum += img[i + 1][j - 1];
                    count++;
                }
                if(i!=0 && j!=0) {
                    sum += img[i - 1][j - 1];
                    count++;
                }
                if(i!=0 && j!=img[i].length-1) {
                    sum += img[i - 1][j + 1];
                    count++;
                }

                average = sum/count;
                newImg[i][j]=average;
            }
        }
        return newImg;
    }

    public static void main(String[] args) {

    }
}
