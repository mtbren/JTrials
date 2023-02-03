package com.internal;

public class TrimBinarySearchTree {
    private TreeNode newRoot;
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null)
            return null;

        if(root.val<low) {
            newRoot = root.right;
            return trimBST(root.right, low, high);
        }else if(root.val>high) {
            newRoot = root.right;
            return trimBST(root.left, low, high);
        }
        return null;
    }
}
