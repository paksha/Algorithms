/*
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

Example:

Input:  [1,2,1,3,2,5]
Output: [3,5]
Note:

The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
*/

class Solution {
    public int[] singleNumber(int[] nums) {
        int len = nums.length;
        Set<Integer> singnum = new HashSet<>();
        for (int i = 0; i < len; ++i) {
            if (singnum.contains(nums[i])) {
                singnum.remove(nums[i]);
            } else {
                singnum.add(nums[i]);
            }
        }
        int len2 = singnum.size();
        int[] array = new int[len2];
        int j = 0;
        for (Integer val : singnum) {
            array[j++] = val;
        }
        return array;
    }
}