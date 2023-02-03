package com.internal;

public class MaximumDepthOfTree {
    private static int maxDepth(Node root) {
        if(root == null){
            return 0;
        }else if(root.children==null || root.children.isEmpty()){
            return 1;
        }else{
            int tempMax=0;
            for(int i=0;i<root.children.size();i++){
                tempMax = Math.max(tempMax, 1+maxDepth(root.children.get(i)));
            }
            return tempMax;
        }

    }
    /*private static int maxDepth(List<Node> list, int depth){
        if(list==null||list.isEmpty())
            return 0;

        depth=depth+1;
        for(int i=0;i<list.size();i++){
            depth=maxDepth(list.get(i).children,depth);
        }
        return depth;
    }*/
}
