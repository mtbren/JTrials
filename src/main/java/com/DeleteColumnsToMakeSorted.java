package com;

public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int countOfColumnsToBeDeleted = 0;
        for (int j = 0; j < strs[0].length(); j++) {
            char prevChar = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if(prevChar <= strs[i].charAt(j)) {
                    prevChar = strs[i].charAt(j);
                    continue;
                }else{
                    countOfColumnsToBeDeleted ++;
                    break;
                }
            }
        }
        return countOfColumnsToBeDeleted;
    }

    public static void main(String[] args) {
        DeleteColumnsToMakeSorted dctms = new DeleteColumnsToMakeSorted();
        System.out.println(dctms.minDeletionSize(
                new String[]{"abc", "bce", "cae"}
        )); //1
        System.out.println(dctms.minDeletionSize(
                new String[]{"cba","daf","ghi"}
        )); //1
        System.out.println(dctms.minDeletionSize(
                new String[]{"a","b"}
        )); //0
        System.out.println(dctms.minDeletionSize(
                new String[]{"zyx","wvu","tsr"}
        )); //3
        System.out.println(dctms.minDeletionSize(
                new String[]{"rrjk","furt","guzm"}
        )); //2
    }
}
