package com.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageOfLevelsOfBinaryTree {
    private List<Double> avgOfLevels = new ArrayList<Double>();
    private Map<Integer,ArrayList<Integer>> levelNodes = new HashMap<Integer,ArrayList<Integer>>();
    public List<Double> averageOfLevels(TreeNode root) {
        if(root!=null) {
            addAvgOfLevels(root,0);
        }
        levelNodes.keySet().forEach(level -> {
           List<Integer> values = levelNodes.get(level);
           double total=0;
           for(int i=0;i<values.size();i++){
               total+=values.get(i);
           }
           avgOfLevels.add(total/values.size());
        });

        return avgOfLevels;
    }
    private void addAvgOfLevels(TreeNode root, int level){
        if(root!=null) {
            if (!levelNodes.containsKey(level)) {
                levelNodes.put(level, new ArrayList<>());
            }
            levelNodes.get(level).add(root.val);
            addAvgOfLevels(root.left,level+1);
            addAvgOfLevels(root.right,level+1);
        }
    }

    public static void main(String[] args) {
        AverageOfLevelsOfBinaryTree albt = new AverageOfLevelsOfBinaryTree();
        System.out.println(albt.averageOfLevels(new TreeNode(3)));
        albt = new AverageOfLevelsOfBinaryTree();
        System.out.println(albt.averageOfLevels(new TreeNode(3,
                new TreeNode(2),
                new TreeNode(1))));

        albt = new AverageOfLevelsOfBinaryTree();
        System.out.println(albt.averageOfLevels(new TreeNode(3,
                new TreeNode(2),null)));

        albt = new AverageOfLevelsOfBinaryTree();
        System.out.println(albt.averageOfLevels(new TreeNode(3,
                null,new TreeNode(2))));

        albt = new AverageOfLevelsOfBinaryTree();
        System.out.println(albt.averageOfLevels(new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)))));

        albt = new AverageOfLevelsOfBinaryTree();
        System.out.println(albt.averageOfLevels(new TreeNode(3,
                new TreeNode(9, new TreeNode(15), new TreeNode(7)),
                new TreeNode(20))));

        albt = new AverageOfLevelsOfBinaryTree();
        System.out.println(albt.averageOfLevels(new TreeNode(2147483647,
                new TreeNode(2147483647),
                new TreeNode(2147483647))));
    }
}
