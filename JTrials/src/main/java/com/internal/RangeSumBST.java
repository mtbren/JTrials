package com.internal;

import java.util.Set;

public class RangeSumBST {
    private int currentSum = 0;
    private Set<Integer> includedNodes;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null)
            return 0;
        if(root.val < low)
            rangeSumBST(root.right, low, high);
        else if(root.val > high)
            rangeSumBST(root.left, low, high);
        return 0;
    }
}
