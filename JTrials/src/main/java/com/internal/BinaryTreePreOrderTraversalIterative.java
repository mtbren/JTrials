package com.internal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversalIterative {
    private int top = 0;
    private TreeNode[] stack = new TreeNode[101];
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null)
            return list;
        while(root != null) {
            list.add(root.val);
            if (root.right!=null) {
                stack[top++]=root.right;
            }
            if(root.left != null){
                root = root.left;
            }else if(top>0){
                root = stack[--top];
            }else{
                break;
            }

        }
        return list;
    }

    public static void main(String[] args) {
        BinaryTreePreOrderTraversalIterative bTree = new BinaryTreePreOrderTraversalIterative();
        System.out.println(bTree.preorderTraversal(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3))));
        bTree = new BinaryTreePreOrderTraversalIterative();
        System.out.println(bTree.preorderTraversal(null));
        bTree = new BinaryTreePreOrderTraversalIterative();
        System.out.println(bTree.preorderTraversal(new TreeNode(1)));
    }

}
