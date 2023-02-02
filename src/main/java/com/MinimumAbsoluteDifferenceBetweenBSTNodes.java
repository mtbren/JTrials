package com;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;


public class MinimumAbsoluteDifferenceBetweenBSTNodes {
    private int minDist = Integer.MAX_VALUE;
    private List<Integer> list = new ArrayList<Integer>();
    public int minDiffInBST(TreeNode root) {
        addToSet(root);
        int[] arr = new int[list.size()];
        for(int i=0;i< list.size();i++){
            arr[i]= list.get(i);
        }
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            minDist = Math.min(minDist, Math.abs(arr[i]-arr[i-1]));
        }
        return minDist;
    }
    private void addToSet(TreeNode root){
        if(root!=null){
            list.add(root.val);
            addToSet(root.left);
            addToSet(root.right);
        }
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifferenceBetweenBSTNodes x = new MinimumAbsoluteDifferenceBetweenBSTNodes();
        System.out.println(
                x.minDiffInBST(new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(6)))
        );//1

        x = new MinimumAbsoluteDifferenceBetweenBSTNodes();
        System.out.println(
                x.minDiffInBST(new TreeNode(1,
                        new TreeNode(0),
                        new TreeNode(48, new TreeNode(12), new TreeNode(49))                        ))
        );

        x = new MinimumAbsoluteDifferenceBetweenBSTNodes();
        System.out.println(
                x.minDiffInBST(new TreeNode(1,
                        new TreeNode(1),
                        null))
        );//0

    }
}
