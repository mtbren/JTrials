package com.internal;

public class RangeSumOfBST {
    private int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null)
            return this.sum;
        if(root.val >= low && root.val <= high)
            sum = sum + root.val;
        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low, high);
        return sum;
    }

    public static void main(String[] args) {
        RangeSumOfBST rsBST = new RangeSumOfBST();
        System.out.println(rsBST.rangeSumBST(
                new TreeNode(10,
                        new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                        new TreeNode(15, null, new TreeNode(18))),
                7, 15));
        rsBST = new RangeSumOfBST();
        System.out.println(rsBST.rangeSumBST(
                new TreeNode(10,
                        new TreeNode(5,
                                new TreeNode(3, new TreeNode(1), null),
                                new TreeNode(7, new TreeNode(6), null)),
                        new TreeNode(15,
                                new TreeNode(13),
                                new TreeNode(18))),
                6, 10));
    }
}
