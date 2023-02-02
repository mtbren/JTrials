package com;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreOrderTraversal {
    private List<Integer> preOrder = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null)
            return preOrder;
        preOrder.add(root.val);
        root.children.forEach(node -> {
            preorder(node);
        });
        return preOrder;
    }
}
