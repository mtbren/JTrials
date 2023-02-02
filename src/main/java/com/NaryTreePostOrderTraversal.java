package com;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostOrderTraversal {
    private List<Integer> nodeValList = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root==null)
            return nodeValList;

        List<Node> innerList = root.children;
        if(innerList != null && !innerList.isEmpty()) {
            innerList.forEach(item -> {
                postorder(item);
            });
        }
        nodeValList.add(root.val);

        return nodeValList;
    }

    public static void main(String[] args) {

    }
}
