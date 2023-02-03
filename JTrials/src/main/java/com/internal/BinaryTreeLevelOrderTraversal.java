package com.internal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    private List<List<Integer>> treeIntList =
            new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root!=null){
            List<ArrayList<TreeNode>> treeList =
                    new ArrayList<ArrayList<TreeNode>>();
            ArrayList<TreeNode> innerList = new ArrayList<>();
            ArrayList<Integer> innerIntList = new ArrayList<>();
            innerList.add(root);
            innerIntList.add(root.val);
            treeList.add(innerList);
            treeIntList.add(innerIntList);

            while(innerList!=null && !innerList.isEmpty()){
                innerList = levelOrderNode(innerList);
                treeList.add(innerList);
            }
        }


        return treeIntList;
    }
    private ArrayList<TreeNode> levelOrderNode(List<TreeNode> list){
        ArrayList<TreeNode> retList ;
        if(list!=null && !list.isEmpty()){
            retList = new ArrayList<TreeNode>();
            ArrayList<Integer> innerIntList = new ArrayList<>();
            for (TreeNode treeNode : list) {
                if(treeNode.left != null) {
                    retList.add(treeNode.left);
                    innerIntList.add(treeNode.left.val);
                }
                if(treeNode.right != null) {
                    retList.add(treeNode.right);
                    innerIntList.add(treeNode.right.val);
                }
            }
            if(innerIntList!= null && !innerIntList.isEmpty())
                treeIntList.add(innerIntList);
            return retList;
        }
        return null;
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal level = new BinaryTreeLevelOrderTraversal();
        System.out.println(level.levelOrder(new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,new TreeNode(15), new TreeNode(7)))));
        level = new BinaryTreeLevelOrderTraversal();
        System.out.println(level.levelOrder(new TreeNode(1)));
        level = new BinaryTreeLevelOrderTraversal();
        System.out.println(level.levelOrder(null));
    }

}
