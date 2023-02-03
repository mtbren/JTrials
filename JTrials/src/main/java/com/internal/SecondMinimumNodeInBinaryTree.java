package com.internal;

import java.util.HashSet;
import java.util.Set;

public class SecondMinimumNodeInBinaryTree {
    //int[] min = new int[2];
    Set<Integer> nodeVals ;
    public int findSecondMinimumValue(TreeNode root) {
        nodeVals = new HashSet<Integer>();
        if(root == null)
            return -1;
        traverse(root);
        if(nodeVals.size()>1) {
            return (int)(nodeVals.stream().sorted().toArray()[1]);
        }else
            return -1;
    }

    private void traverse(TreeNode root){
        if(root == null)
            return;
        else
            nodeVals.add(root.val);
        if(root.left!=null)
            traverse(root.left);
        if(root.right != null)
            traverse(root.right);
    }

    public static void main(String[] args) {
        SecondMinimumNodeInBinaryTree sec = new SecondMinimumNodeInBinaryTree();
        /*System.out.println(sec.findSecondMinimumValue(
                new TreeNode(2, new TreeNode(3), new TreeNode(2))
        )); // 3
        System.out.println(sec.findSecondMinimumValue(
                new TreeNode(2, new TreeNode(2),
                        new TreeNode(5,new TreeNode(5), new TreeNode(7)))
        )); // 5 */
        System.out.println(sec.findSecondMinimumValue(
            new TreeNode(2, new TreeNode(2),new TreeNode(2147483647))
        )); // 2147483647
    }
}
