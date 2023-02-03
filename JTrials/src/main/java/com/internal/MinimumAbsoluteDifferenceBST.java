package com.internal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MinimumAbsoluteDifferenceBST {
    private static int getMinimumDifference(TreeNode root) {
        Set<Integer> valueSet = new HashSet<Integer>();
        int retval = addToSet(root, valueSet);

        if(retval != 0){
            int[] valArr = new int[valueSet.size()];
            Iterator<Integer> iter = valueSet.iterator();
            int i=0;
            while(iter.hasNext()){
                valArr[i]= iter.next();
                i++;
            }

            Arrays.sort(valArr);
            i=0;
            int minDiff = (int)valArr[i+1]-(int)valArr[i];
            while(i<valArr.length-1){
                if((int)valArr[i]+1==(int)valArr[i+1]){
                    return 1;
                }else{
                    if(minDiff>(int)valArr[i+1]-(int)valArr[i]){
                        minDiff=(int)valArr[i+1]-(int)valArr[i];
                    }
                }
                i++;
            }
            return minDiff;
        }else {
            return retval;
        }
    }
    private static int addToSet(TreeNode node, Set<Integer> set){
        if(set.contains(node.val)){
            return 0;
        }else{
            set.add(node.val);
        }
        if(node.left != null){
            if(addToSet(node.left, set)==0)
                return 0;
        }
        if(node.right != null){
            if(addToSet(node.right, set)==0)
                return 0;
        }

        return -1;
    }

    public static void main(String[] args) {
        /*System.out.println(getMinimumDifference(
                new TreeNode(4,
                        new TreeNode(2,new TreeNode(1), new TreeNode(3)),
                        new TreeNode(6))
        ));
        System.out.println(getMinimumDifference(
                new TreeNode(1,
                        new TreeNode(0),
                        new TreeNode(48,new TreeNode(12), new TreeNode(49)))
        ));
        System.out.println(getMinimumDifference(
                new TreeNode(1,
                        null,
                        new TreeNode(5,new TreeNode(3), null))
        ));*/
        System.out.println(getMinimumDifference(
                new TreeNode(543,
                        new TreeNode(384, null,new TreeNode(445)),
                        new TreeNode(652,null, new TreeNode(699)))
        ));
    }

}
