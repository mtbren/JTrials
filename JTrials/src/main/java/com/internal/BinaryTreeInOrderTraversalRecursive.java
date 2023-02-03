package com.internal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversalRecursive {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null)
            return list;
        inorder(root, list);
        return list;
    }

    private void inorder(TreeNode root, List<Integer> myList) {
        if (root != null) {
            inorder(root.left, myList);
            myList.add(root.val);
            inorder(root.right, myList);
        }

        /*if(root!=null && root.left!=null){
            inorder(root.left,myList);
        }
        if(root!=null)
            myList.add(root.val);
        if(root!=null && root.right!=null){
            inorder(root.right,myList);
        }*/
    }

    public static void main(String[] args) {
        BinaryTreeInOrderTraversalRecursive bTree = new BinaryTreeInOrderTraversalRecursive();
        System.out.println(bTree.inorderTraversal(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3))));
        bTree = new BinaryTreeInOrderTraversalRecursive();
        System.out.println(bTree.inorderTraversal(null));
        bTree = new BinaryTreeInOrderTraversalRecursive();
        System.out.println(bTree.inorderTraversal(new TreeNode(1)));
    }
}
