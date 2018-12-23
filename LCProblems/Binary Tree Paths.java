/*
Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3
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

// recurse on each non-leaf node for all paths
// if leaf node, end and add path string to list
import java.util.*;
class Solution {
    private void path(TreeNode root, String pathsofar, List<String> ls) {
        if (root == null) return;
        pathsofar += Integer.toString(root.val);
        if (root.left == null && root.right == null) {
            ls.add(pathsofar);
            return;
        }
        pathsofar += "->";
        path(root.left, pathsofar, ls);
        path(root.right, pathsofar, ls);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) path(root, "", paths);
        return paths;
    }
}