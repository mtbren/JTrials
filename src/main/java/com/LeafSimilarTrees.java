package com;

public class LeafSimilarTrees {
    private StringBuffer leaf1 = new StringBuffer();
    private StringBuffer leaf2 = new StringBuffer();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        leaf1 = traverseTree(root1, leaf1);
        System.out.println(leaf1);
        leaf2 = traverseTree(root2, leaf2);
        System.out.println(leaf2);
        if(leaf1.toString().equals(leaf2.toString()))
            return true;
        return false;
    }
    private StringBuffer traverseTree(TreeNode root, StringBuffer s){
        if(root.left==null && root.right == null) {
            s.append(root.val + ",");
        }
        if(root.left != null)
            traverseTree(root.left, s);
        if(root.right != null)
            traverseTree(root.right, s);
        return s;
    }

    public static void main(String[] args) {
        LeafSimilarTrees lst = new LeafSimilarTrees();
        lst.leafSimilar(new TreeNode(3,
                    new TreeNode(5, new TreeNode(6),
                            new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                    new TreeNode(1, new TreeNode(9), new TreeNode(8))),
                new TreeNode(3,
                        new TreeNode(5,new TreeNode(6),new TreeNode(7)),
                        new TreeNode(1, new TreeNode(4),
                                new TreeNode(2, new TreeNode(9), new TreeNode(8)))));
        lst = new LeafSimilarTrees();
        lst.leafSimilar(new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(3), new TreeNode(2)));
    }
}
