package com.internal;


public class SumOfLeftLeaves {
    private static int sumOfLeftLeaves(TreeNode root) {
        return sumLeft(root,0);
    }
    private static int sumLeft(TreeNode root,int currentSum){
        if(root == null)
            return currentSum;
        if(root.left != null && root.left.left == null && root.left.right == null) {
            currentSum += root.left.val;

        }
        if(root.left != null && (root.left.left != null || root.left.right != null)) {
            return sumLeft(root.left, currentSum);
        }

        if(root.right != null && (root.right.left != null || root.right.right != null)) {
            return sumLeft(root.right, currentSum);
        }



        /*if(root.right != null){
            return sumLeft(root.right,currentSum);
        }*/
        return currentSum;

    }

    public static void main(String[] args) {
        /*System.out.println(sumOfLeftLeaves(new TreeNode(3,new TreeNode(9),
                new TreeNode(20,new TreeNode(15), new TreeNode(7)))));
        //24

        System.out.println(sumOfLeftLeaves(new TreeNode(1)));
        //0

        System.out.println(sumOfLeftLeaves(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3))));
        //4

        System.out.println(sumOfLeftLeaves(new TreeNode(5, new TreeNode(9),
                        new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        //24
        //[3,4,5,-7,-6,null,null,-7,null,-5,null,null,null,-4]
        System.out.println(sumOfLeftLeaves(new TreeNode(3,
                new TreeNode(4, new TreeNode(-7, new TreeNode(-7), null)
                        , new TreeNode(-6,new TreeNode(-5, new TreeNode(-4), null),null)),
                new TreeNode(5))));*/

        System.out.println(sumOfLeftLeaves(
                new TreeNode(4, new TreeNode(-7, new TreeNode(-7), null)
                        , new TreeNode(-6,new TreeNode(-5, new TreeNode(-4), null),null))));

    }
}
