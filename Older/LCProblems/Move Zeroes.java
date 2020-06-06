/*
283. Move Zeroes
Easy
1541
58


Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return;
        }
        int index = 0;
        for (int i = 0; i < len; ++i) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        while (index < len) {
            nums[index] = 0;
            index++;
        }
    }
}