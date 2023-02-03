package com.internal;

public class CousinsInBinaryTree {
    int xDepth = -1;
    int yDepth = -1;
    int xParentVal = -1;
    int yParentVal = -1;
    public boolean isCousins(TreeNode root, int x, int y) {
        return areCousins(root, x, y, 0, -1);
    }
    private boolean areCousins(TreeNode root, int x,
                               int y, int currDepth, int parentVal){
        if(root == null)
            return false;
        if(root.val == x) {
            xDepth = currDepth;
            xParentVal = parentVal;
        }
        if(root.val == y) {
            yDepth = currDepth;
            yParentVal = parentVal;
        }
        if(xDepth > -1 && yDepth > -1){
            return xDepth==yDepth && xParentVal!=yParentVal;
        }


        if(! areCousins(root.left, x, y, currDepth+1, root.val))
            return areCousins(root.right, x, y, currDepth+1, root.val);
        return true;
    }

    public static void main(String[] args) {
        CousinsInBinaryTree cbt = new CousinsInBinaryTree();
        System.out.println(cbt.isCousins(new TreeNode(1,
                new TreeNode(2,new TreeNode(4), null),
                new TreeNode(3)), 4,3)); // false
        cbt = new CousinsInBinaryTree();
        System.out.println(cbt.isCousins(new TreeNode(1,
                        new TreeNode(2,new TreeNode(4), null),
                        new TreeNode(3)), 2,3)); // false
        cbt = new CousinsInBinaryTree();
        System.out.println(cbt.isCousins(new TreeNode(1,
                        new TreeNode(2, null,new TreeNode(4)),
                        new TreeNode(3, null,new TreeNode(5))),5,4)); // true
        cbt = new CousinsInBinaryTree();
        System.out.println(cbt.isCousins(new TreeNode(1,
                new TreeNode(2, null,new TreeNode(4)),
                new TreeNode(3)),2,3)); // false
    }
}
