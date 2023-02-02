package com;

public class IncreasingOrderSearchTree {
    private TreeNode retTree = null;
    private TreeNode origRetTree = null;

    public TreeNode increasingBST(TreeNode root) {
        if(root!=null){
            if(root.left != null)
                increasingBST(root.left);
            System.out.println(root.val);
            if(retTree == null){
                retTree = new TreeNode(root.val);
                origRetTree = retTree;
            }else{
                retTree.right = new TreeNode(root.val);
                retTree = retTree.right;
            }
            if(root.right != null)
                increasingBST(root.right);
        }


        return origRetTree;
}

    public static void main(String[] args) {
        TreeNode iost = new IncreasingOrderSearchTree().increasingBST(
                new TreeNode(5,
                    new TreeNode(1),
                    new TreeNode(7)));
        System.out.println();
        iost = new IncreasingOrderSearchTree().increasingBST(
                new TreeNode(5,
                        new TreeNode(3,
                                new TreeNode(2, new TreeNode(1),null),
                                new TreeNode(4)),
                        new TreeNode(6,
                                null,
                                new TreeNode(8, new TreeNode(7), new TreeNode(9)))));
        System.out.println();
    }
}
