package com;

public class ConstructStringFromBinaryTree {
    private static StringBuilder tree2Bldr ;
    private static String tree2str(TreeNode root) {
        tree2Bldr = new StringBuilder();
        if(root==null) {
            return tree2Bldr.toString();
        }else{
            add2Bldr(root);
        }
        String tree2Str = tree2Bldr.toString();
        while(tree2Str.contains("())")){
            tree2Str=tree2Str.replace("())",")");
        }
        while(tree2Str.endsWith("()")){
            tree2Str=tree2Str.substring(0,tree2Str.length()-2);
        }

        return tree2Str;
    }
    private static void add2Bldr(TreeNode root){
        tree2Bldr.append(root.val);
        if(root.left != null){
            tree2Bldr.append("(");
            add2Bldr(root.left);
            tree2Bldr.append(")");
        }else{
            tree2Bldr.append("()");
        }
        if(root.right != null){
            tree2Bldr.append("(");
            add2Bldr(root.right);
            tree2Bldr.append(")");
        }else{
            tree2Bldr.append("()");
        }
    }

    public static void main(String[] args) {
        System.out.println(tree2str(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3))));
        System.out.println(tree2str(new TreeNode(1,
                new TreeNode(2, null,new TreeNode(4)),
                new TreeNode(3))));
    }
}
