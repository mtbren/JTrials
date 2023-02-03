package com.internal;

public class BinaryTreeDiameter {

    private static int diameterOfBinaryTree(TreeNode root){
        if(root == null){
            return 0;
        }else if(root.left==null && root.right==null) {
            return 0;
        }else{
            return Math.max(0,diameterOfBinaryTree(root,0));
        }
    }

    private static int diameterOfBinaryTree(TreeNode root,int max){
        if(root == null){
            return 0;
        }else if(root.left==null && root.right==null){
            return 0;
        }else{
            int leftHeight = heightOfBinaryTree(root.left);
            int rightHeight = heightOfBinaryTree(root.right);
            max = Math.max(max,leftHeight+rightHeight);
            max = Math.max(max,diameterOfBinaryTree(root.left,max));
            max = Math.max(max,diameterOfBinaryTree(root.right,max));
            return max;
        }

    }



    private static int heightOfBinaryTree(TreeNode root) {
        if(root==null) {
            return 0;
        }else if (root.left==null && root.right==null){
            return 1;
        }else{
            return 1+Math.max(heightOfBinaryTree(root.left),heightOfBinaryTree(root.right));
        }

    }

    public static void main(String[] args) {
        System.out.println(diameterOfBinaryTree(new TreeNode(1)));
        System.out.println(diameterOfBinaryTree(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3)
        )));
    }
}
