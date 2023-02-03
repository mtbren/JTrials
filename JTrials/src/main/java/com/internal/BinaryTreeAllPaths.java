package com.internal;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class BinaryTreeAllPaths {
    private static List<String> binaryTreePaths(TreeNode root) {
        List<String> finalList = new ArrayList<String>();
        traverseTree(root, null, finalList);
        return finalList;
    }

    private static void traverseTree(TreeNode root, String str, List<String> list) {
        if(str == null) {
            str = new String();
        }
        if(root != null){
            str = str + root.val;
        }
        if(root.left == null && root.right==null){
            list.add(str);
        }else{
            str = str + "->";
            if(root.left != null){
                traverseTree(root.left, str, list);
            }
            if(root.right != null){
                traverseTree(root.right, str, list);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(binaryTreePaths(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3))));
    }

}
