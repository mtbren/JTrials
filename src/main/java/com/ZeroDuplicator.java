package com;

public class ZeroDuplicator {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                //shift
                for(int j=arr.length-1;j>i;j--){
                    arr[j]=arr[j-1];
                }
                if(i < arr.length - 1) {
                    arr[i + 1] = 0;
                    i++;
                }
            }
        }
        int a = 0;
    }

    public static void main(String[] args) {
        ZeroDuplicator zd = new ZeroDuplicator();
        zd.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
        zd.duplicateZeros(new int[]{1,2,3});
        zd.duplicateZeros(new int[]{1});
        zd.duplicateZeros(new int[]{0});
    }

}
