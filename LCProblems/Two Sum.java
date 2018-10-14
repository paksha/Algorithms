/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/

// Akshay Patel

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        int i = 0;
        int j = temp.length-1;
        int[] indices = new int[2];
        indices[0] = -1;
        while (i<j) {
            if (temp[i] + temp[j] == target) {
                break;
            } else if (temp[i] + temp[j] > target) {
                j--;
            } else if (temp[i] + temp[j] < target) {
                i++;
            } else {
                continue;
            }
        }
        for (int a = 0; a < nums.length; a++) {
            if (nums[a] == temp[i] && indices[0] == -1) {
                indices[0] = a;
            } else if (nums[a] == temp[j]) {
                indices[1] = a;
            }
        }
        return indices;
    }
}
