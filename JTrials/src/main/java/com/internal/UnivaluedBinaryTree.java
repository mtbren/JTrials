package com.internal;

public class UnivaluedBinaryTree {
    private int uniVal ;
    public boolean isUnivalTree(TreeNode root) {
        if (root == null){
            return true;
        }
        this.uniVal = root.val;

        return isUnivalTree(root, root.val);
    }
    private boolean isUnivalTree(TreeNode root, int value) {
        if (root==null){
            return true;
        }
        return (this.uniVal==root.val && isUnivalTree(root.left, value)
            && isUnivalTree(root.right, value));
    }

    public static void main(String[] args) {
        System.out.println(new UnivaluedBinaryTree().isUnivalTree(
                new TreeNode(1,
                        new TreeNode(1, new TreeNode(1), new TreeNode(1)),
                        new TreeNode(1, null, new TreeNode(1))
                )
        ));
        System.out.println(new UnivaluedBinaryTree().isUnivalTree(
                new TreeNode(1,
                        new TreeNode(1, new TreeNode(1), new TreeNode(1)),
                        new TreeNode(1, null, new TreeNode(2))
                )
        ));
        System.out.println(new UnivaluedBinaryTree().isUnivalTree(
                new TreeNode(2,
                        new TreeNode(1, new TreeNode(2), new TreeNode(2)),
                        new TreeNode(2, null, new TreeNode(2))
                )
        ));
    }
}
