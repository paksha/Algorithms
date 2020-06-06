/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode createBST(int[] nums, int start, int len) {
        if (len == 0) return null;
        int mid = len/2;
        TreeNode root = new TreeNode(nums[start+mid]);
        root.left = createBST(nums, start, mid);
        root.right = createBST(nums, start+mid+1, len-mid-1);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length);
    }
}