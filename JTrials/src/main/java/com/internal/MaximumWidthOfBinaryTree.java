package com.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumWidthOfBinaryTree {

    private Map<Integer, List<Byte>> levelList =
            new HashMap<Integer,List<Byte>>();
    public int widthOfBinaryTree(TreeNode root) {
        //addLevel(root,1);
        addListPerLevelBetter(root,1);
        int maxWidth = Byte.MIN_VALUE;
        int tempWidth = Byte.MIN_VALUE;
        for(Integer level : levelList.keySet()){
            tempWidth = getRealWidth(levelList.get(level));
            if(maxWidth<tempWidth)
                maxWidth = tempWidth;
        }
        return maxWidth;
    }
    private int getRealWidth(List<Byte> list){
        int i=0,j=list.size()-1;
        int realWidth = 0;
        while(i<=j){
            if(list.get(i)!=null && list.get(j)!= null)
                break;
            if(list.get(i)==null)
                i++;
            if(list.get(j)==null)
                j--;
        }
        if(i>j)
            realWidth = 0;
        if(i==j)
            if(list.get(i)==null)
                realWidth = 0;
            else
                realWidth = 1;
        if(i<j)
            realWidth = j-i+1;

        return realWidth;
    }

    private void addListPerLevelBetter(TreeNode root,int level){
        if(levelList.containsKey(level)){
            /*if(root == null) {
                levelList.get(level).add(null);
            }*/
        }else{
            if(root!=null) {
                levelList.put(level, new ArrayList<Byte>());
            }
        }

        if(root!=null){
            levelList.get(level).add((byte)root.val);
            addListPerLevelBetter(root.left,level+1);
            addListPerLevelBetter(root.right,level+1);
        }else{
            if(levelList.containsKey(level)){
                levelList.get(level).add(null);
                addListPerLevelBetter(null,level+1);
                addListPerLevelBetter(null,level+1);
            }
        }
    }

    private void addListPerLevel(TreeNode root, int level){
        if(!levelList.containsKey(level))
            //levelList.put(level,new ArrayList<Integer>());
            return;
        if(root==null) {
            levelList.get(level).add(null);
            addListPerLevel(null,level+1);
            addListPerLevel(null,level+1);
        }else{
            levelList.get(level).add((byte)root.val);
            addListPerLevel(root.left,level+1);
            addListPerLevel(root.right,level+1);
        }

    }
    private void addLevel(TreeNode root, int level){
        if(root != null ) {
            if( !levelList.containsKey(level)) {
                levelList.put(level, new ArrayList<Byte>());
            }
            addLevel(root.left, level + 1);
            addLevel(root.right, level + 1);
        }
    }
    /*private void addWidthPerLevel(TreeNode root, int level){
        if (root==null)
            return;
        else{
            if(levelWidth.containsKey(level)){
                levelWidth.put(level,levelWidth.get(level)+1);
            }else{
                levelWidth.put(level,1);
            }
        }
        if(root.left != null)
            addWidthPerLevel(root.left,level+1);
        if(root.right != null)
            addWidthPerLevel(root.right, level+1);
    }*/

    public static void main(String[] args) {
        MaximumWidthOfBinaryTree mwbt = new MaximumWidthOfBinaryTree();

        System.out.println(mwbt.widthOfBinaryTree(
                new TreeNode(1,
                        new TreeNode(3, new TreeNode(5), new TreeNode(3)),
                        new TreeNode(2, null, new TreeNode(9)))
        ));//4

        mwbt = new MaximumWidthOfBinaryTree();
        System.out.println(mwbt.widthOfBinaryTree(
                new TreeNode(1,
                        new TreeNode(3, new TreeNode(5), new TreeNode(3)),
                        null)
        ));//2

        mwbt = new MaximumWidthOfBinaryTree();
        System.out.println(mwbt.widthOfBinaryTree(
                new TreeNode(1,
                        new TreeNode(3, new TreeNode(5), null),
                        new TreeNode(2))
        ));//2
        mwbt = new MaximumWidthOfBinaryTree();
        System.out.println(mwbt.widthOfBinaryTree(
                new TreeNode(1)
        ));//1
        mwbt = new MaximumWidthOfBinaryTree();
        System.out.println(mwbt.widthOfBinaryTree(
                new TreeNode(1, new TreeNode(2), new TreeNode(3))
        ));//2
        mwbt = new MaximumWidthOfBinaryTree();
        System.out.println(mwbt.widthOfBinaryTree(
                new TreeNode(1, new TreeNode(2),null)
        ));//1
        mwbt = new MaximumWidthOfBinaryTree();
        System.out.println(mwbt.widthOfBinaryTree(
                new TreeNode(1, null,new TreeNode(2))
        ));//1

        mwbt = new MaximumWidthOfBinaryTree();
        System.out.println(mwbt.widthOfBinaryTree(
                new TreeNode(1,
                        new TreeNode(3,
                                new TreeNode(5,
                                        new TreeNode(6),
                                        null),
                                null),
                        new TreeNode(2,
                                null,new TreeNode(9,
                                null,new TreeNode(7))))
        ));//8


        mwbt = new MaximumWidthOfBinaryTree();
        System.out.println(mwbt.widthOfBinaryTree(
                new TreeNode(1,
                        new TreeNode(1,
                                new TreeNode(1),
                                new TreeNode(1,null,
                                        new TreeNode(1))),
                        new TreeNode(1,new TreeNode(1),
                                new TreeNode(1)))
        ));//4

    }

}
