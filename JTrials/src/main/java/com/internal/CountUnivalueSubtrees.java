package com.internal;

public class CountUnivalueSubtrees {
    private int count = 0;

    public int countUnivalSubtrees(TreeNode root) {
        if (root == null)
            return 0;
        isUnival(root);
        return count;
    }

    private boolean isUnival(TreeNode root) {
        if(root == null)
            return true;
        if(root.left == null && root.right == null){
            count++;
            return true;
        }else if (root.left==null){
            if(root.val == root.right.val & isUnival(root.right)){
                count++;
                return true;
            }else{
                return false;
            }
        }else if (root.right==null){
            if(root.val == root.left.val & isUnival(root.left)){
                count++;
                return true;
            }else{
                return false;
            }
        }else{
            if(root.val == root.left.val &
                root.val == root.right.val &
                isUnival(root.left) & isUnival(root.right)){
                count++;
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        CountUnivalueSubtrees cUniv = new CountUnivalueSubtrees();
        System.out.println(cUniv.countUnivalSubtrees(
                new TreeNode(5,
                        new TreeNode(1, new TreeNode(5),
                                new TreeNode(5)),
                        new TreeNode(5, null,
                                new TreeNode(5)))
        ));//4

        cUniv = new CountUnivalueSubtrees();
        System.out.println(cUniv.countUnivalSubtrees(
                new TreeNode(5,
                        new TreeNode(1, new TreeNode(5), new TreeNode(5)),
                        null)
        ));//2

        cUniv = new CountUnivalueSubtrees();
        System.out.println(cUniv.countUnivalSubtrees(
                new TreeNode(2,
                        new TreeNode(1, new TreeNode(5), new TreeNode(5)),
                        null)
        ));//0

        cUniv = new CountUnivalueSubtrees();
        System.out.println(cUniv.countUnivalSubtrees(
                new TreeNode(5, null, null)
        ));//1

        cUniv = new CountUnivalueSubtrees();
        System.out.println(cUniv.countUnivalSubtrees(
                null
        ));//0

        cUniv = new CountUnivalueSubtrees();
        System.out.println(cUniv.countUnivalSubtrees(
                new TreeNode(5,
                        new TreeNode(5, new TreeNode(5),
                                new TreeNode(5)),
                        new TreeNode(5, null,
                                new TreeNode(5)))
        ));//6

        cUniv = new CountUnivalueSubtrees();
        System.out.println(cUniv.countUnivalSubtrees(
                new TreeNode(5,
                        new TreeNode(5),
                        new TreeNode(1))
        ));//2

    }
}
