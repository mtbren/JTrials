package com.internal;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class BinaryTreeClosestSearchValue {
    private static int closestValue(TreeNode root, double target) {
        if(root.val==target)
            return root.val;
        else{
            return findClosest(root,target,root.val);
        }
    }
    private static int findClosest(TreeNode root, double target, int currentClosest){
        if(root != null){
            currentClosest = Math.abs(root.val-target)<Math.abs(currentClosest-target) ?
                    root.val : currentClosest;
        }else{
            return currentClosest;
        }

        if(root.left!= null){
            currentClosest = findClosest(root.left,target,currentClosest);
        }
        if(root.right!= null){
            currentClosest = findClosest(root.right,target,currentClosest);
        }
        return currentClosest;
    }
    /*private static int closest;
    private static int closestValue(TreeNode root, double target) {
        closest=root.val;
        if(root.val==target)
            return root.val;
        findClosest(root,target);
        return closest;
    }
    private static void findClosest(TreeNode root, double target){
        if(root != null){
            closest = Math.abs(root.val-target) < Math.abs((closest-target))? root.val : closest;
        }else{
            return;
        }

        if(root.left != null){
            findClosest(root.left,target);
        }
        if(root.right != null){
            findClosest(root.right, target);
        }

    }*/

    public static void main(String[] args) {
        System.out.println(closestValue(new TreeNode(1, new TreeNode(2,new TreeNode(4),new TreeNode(5)),
                new TreeNode(3)),
                3.3));
        System.out.println(closestValue(new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),
                        new TreeNode(5)),
                3.714286));
        System.out.println(closestValue(new TreeNode(1),4.4));
    }
}
