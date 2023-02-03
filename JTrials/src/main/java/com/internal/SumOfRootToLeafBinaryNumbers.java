package com.internal;

import java.util.ArrayList;
import java.util.List;

public class SumOfRootToLeafBinaryNumbers {
    List<Integer> numbersToAdd = new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        traverse(root,new StringBuffer(""));
        int total = 0;
        for(int i=0;i<numbersToAdd.size();i++){
            total = total + numbersToAdd.get(i);
        }
        return 0;
    }
    private void traverse(TreeNode root, StringBuffer binaryRep){
        if (root == null) {
            return;
        }
        binaryRep = binaryRep.append(root.val);
        if(root.left == null && root.right == null){
            numbersToAdd.add(Integer.parseInt(binaryRep.toString(),2));
        }
        traverse(root.left, new StringBuffer(binaryRep));
        traverse(root.right, new StringBuffer(binaryRep));
    }

    public static void main(String[] args) {
        new SumOfRootToLeafBinaryNumbers().sumRootToLeaf(
                    new TreeNode(1,
                            new TreeNode(0, new TreeNode(1), new TreeNode(1)),
                            new TreeNode(1, new TreeNode(0), new TreeNode(1))
                    )
        );

    }
}
