package cz.atasek.Solutions;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] solved = new int[2];
        label1:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    solved[0] = i;
                    solved[1] = j;

                    break label1;

                }

            }
        }
        return solved;
    }
}
