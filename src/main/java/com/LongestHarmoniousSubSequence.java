package com;

public class LongestHarmoniousSubSequence {
    private static int findLHS(int[] nums) {
        int tempLengthP = 0, tempLengthN = 0;
        int finalMax = 0;
        boolean containsOneDiff = false;


        for (int i = 0; i < nums.length; i++) {
            tempLengthP = 0;
            tempLengthN = 0;
            containsOneDiff = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (!containsOneDiff && Math.abs(nums[j] - nums[i]) == 1) {
                    containsOneDiff = true;
                }
                if (nums[j] - nums[i] == 1 || nums[i] == nums[j]) {
                    tempLengthN++;
                }
                if (nums[i] - nums[j] == 1 || nums[i] == nums[j]) {
                    tempLengthP++;
                }
            }
            if (containsOneDiff) {
                if (tempLengthN > finalMax) {
                    finalMax = tempLengthN;
                }
                if (tempLengthP > finalMax) {
                    finalMax = tempLengthP;
                }

            }
        }

        return finalMax > 0 ? finalMax + 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
        System.out.println(findLHS(new int[]{1, 1, 1, 1}));
        System.out.println(findLHS(new int[]{1, 2, 3, 4}));
    }
}
