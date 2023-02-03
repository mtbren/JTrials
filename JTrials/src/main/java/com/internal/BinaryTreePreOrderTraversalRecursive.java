package com.internal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversalRecursive {
    public List<Integer> tList = new ArrayList<>();
    public List<Integer> preorderTraversalImproved(TreeNode root) {
        List<Integer> iList = new ArrayList<>();
        preOrderHelper(root,iList);
        return iList;
    }
    private void preOrderHelper(TreeNode root, List<Integer> myList){
        if(root!= null){
            myList.add(root.val);
            preOrderHelper(root.left,myList);
            preOrderHelper(root.right,myList);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
            return tList;
        else{
            preOrder(root);
        }
        return tList;
    }
    private void preOrder(TreeNode root/*, List<Integer> list*/){
        if(root!=null){
            tList.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreePreOrderTraversalRecursive bTree = new BinaryTreePreOrderTraversalRecursive();
        System.out.println(bTree.preorderTraversalImproved(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3))));
        bTree = new BinaryTreePreOrderTraversalRecursive();
        System.out.println(bTree.preorderTraversalImproved(null));
        bTree = new BinaryTreePreOrderTraversalRecursive();
        System.out.println(bTree.preorderTraversalImproved(new TreeNode(1)));
    }

}
