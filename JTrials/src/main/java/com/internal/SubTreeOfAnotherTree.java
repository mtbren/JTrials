package com.internal;

public class SubTreeOfAnotherTree {
    public static boolean isSubtree(TreeNode root, TreeNode subRoot){

        if(isSubtreeSub(root,subRoot))
            return true;
        if(root == null && subRoot != null)
            return false;
        else return (isSubtree(root.left,subRoot) ||
                isSubtree(root.right,subRoot));
    }
    private static boolean isSubtreeSub(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot != null)
            return false;
        if(root == null && subRoot == null)
            return true;
        if( root != null && subRoot == null)
            return false;
        if(subRoot.left == null && subRoot.right == null){
            if(root.left!=null || root.right!=null)
                return false;
            return subRoot.val == root.val;
        }

        if(root.val == subRoot.val &&
                isSubtreeSub(root.left,subRoot.left) &&
                isSubtreeSub(root.right,subRoot.right)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isSubtree(
                new TreeNode(3,
                        new TreeNode(4,new TreeNode(1), new TreeNode(2)),
                        new TreeNode(5)),
                new TreeNode(4,new TreeNode(1), new TreeNode(2)))
        );// true
        System.out.println(isSubtree(
                new TreeNode(3,
                        new TreeNode(4,new TreeNode(1), new TreeNode(2)),
                        new TreeNode(5)),
                new TreeNode(5))
        );// true
        System.out.println(isSubtree(
                new TreeNode(3),
                new TreeNode(3))
        );// true
        System.out.println(isSubtree(
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(1,new TreeNode(4),null),
                                null),
                        new TreeNode(3)),
                new TreeNode(1, new TreeNode(4),null))
        ); //true


        System.out.println(isSubtree(
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(1,new TreeNode(4),null),
                                null),
                        new TreeNode(3)),
                new TreeNode(1))
        ); //false
        System.out.println(isSubtree(
                new TreeNode(1,
                        new TreeNode(2),
                        new TreeNode(3)),
                new TreeNode(1,new TreeNode(2),null))
        );// false
        System.out.println(isSubtree(
                new TreeNode(3,
                        new TreeNode(4,new TreeNode(1), new TreeNode(2)),
                        new TreeNode(5)),
                new TreeNode(4))
        );// false

        System.out.println(isSubtree(
                new TreeNode(3,
                        new TreeNode(4,new TreeNode(1), new TreeNode(2)),
                        new TreeNode(5)),
                new TreeNode(6))
        );// false
        System.out.println(isSubtree(
                new TreeNode(3,
                        new TreeNode(4,new TreeNode(1), new TreeNode(2)),
                        new TreeNode(5)),
                new TreeNode(3))
        );// false
        System.out.println(isSubtree(
                new TreeNode(3),
                new TreeNode(4))
        );// false

        System.out.println(isSubtree(
                null,
                new TreeNode(4))
        );// false
        System.out.println(isSubtree(
                new TreeNode(3,
                        new TreeNode(4,new TreeNode(1),
                                new TreeNode(2, new TreeNode(0),null)),
                        new TreeNode(5)),
                new TreeNode(4,new TreeNode(1), new TreeNode(2)))
        ); //false


    }
}
