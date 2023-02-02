package com;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversalRecursive {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null)
            return list;
        postorder(root,list);
        return list;
    }
    private void postorder(TreeNode root,List<Integer> myList){
        if(root!=null){
            postorder(root.left,myList);
            postorder(root.right,myList);
            myList.add(root.val);
        }
    }
    public static void main(String[] args) {
        BinaryTreePostOrderTraversalRecursive bTree = new BinaryTreePostOrderTraversalRecursive();
        System.out.println(bTree.postorderTraversal(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3))));
        bTree = new BinaryTreePostOrderTraversalRecursive();
        System.out.println(bTree.postorderTraversal(null));
        bTree = new BinaryTreePostOrderTraversalRecursive();
        System.out.println(bTree.postorderTraversal(new TreeNode(1)));
    }
}
