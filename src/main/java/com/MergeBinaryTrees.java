package com;

public class MergeBinaryTrees {
    private static TreeNode mergedTree;

    private static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode origMergedTree = root1;

        mergeInFirstProper(root1, root2);
        return root1 != null ? root1 : root2;
    }

    private static void mergeInFirstProper(TreeNode root1, TreeNode root2) {
        if (root1 != null && root2 != null) {
            root1.val = root1.val + root2.val;

            if(root1.left != null && root2.left != null) {
                mergeInFirstProper(root1.left, root2.left);
            }else if (root1.left == null && root2.left != null){
                root1.left = root2.left;
            }

            if(root1.right != null && root2.right != null) {
                mergeInFirstProper(root1.right, root2.right);
            }else if (root1.right == null && root2.right != null){
                root1.right = root2.right;
            }
        }

    }

    public static void main(String[] args) {
        mergeTrees(new TreeNode(1,
                        new TreeNode(3, new TreeNode(5),null),
                        new TreeNode(2)),
                new TreeNode(2,
                        new TreeNode(1, null, new TreeNode(4)),
                        new TreeNode(3,null, new TreeNode(7))));

        mergeTrees(new TreeNode(9,
                        new TreeNode(-1, new TreeNode(-2), new TreeNode(0)),
                        null),
                new TreeNode(-1,
                        new TreeNode(-2),
                        new TreeNode(0, null, new TreeNode(8))));
    }

}