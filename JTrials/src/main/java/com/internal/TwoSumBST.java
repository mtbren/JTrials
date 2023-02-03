package com.internal;

import java.util.HashSet;
import java.util.Set;

public class TwoSumBST {
    public Set<Integer> nodeValues = new HashSet<Integer>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null)
            return false;
        if (nodeValues.contains(k - root.val) /*&& !nodeValues.contains(root.val)*/)
            return true;
        nodeValues.add(root.val);
        return (findTarget(root.left, k) || findTarget(root.right, k));
    }

    public static void main(String[] args) {
        TwoSumBST obj = new TwoSumBST();
        TreeNode root = new TreeNode(1);
            //new TreeNode(1), new TreeNode(3));
        System.out.println(obj.findTarget(root,2));

        System.out.println(obj.nodeValues);

        /*TreeNode root = new TreeNode(5,
                new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7)));
        System.out.println(findTarget(root,9));
        System.out.println(findTarget(root, 30));
        TreeNode root1 = new TreeNode(0,
                new TreeNode(-1,new TreeNode(-3), null),
                new TreeNode(2,null, new TreeNode(4)));
        System.out.println(findTarget(root1,-4));*/
    }

}
