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
        StringBuilder str = new StringBuilder(pathsofar);
        if (root == null) return;
        str.append(Integer.toString(root.val));
        if (root.left == null && root.right == null) {
            ls.add(str.toString());
            return;
        }
        str.append("->");
        path(root.left, str.toString(), ls);
        path(root.right, str.toString(), ls);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) path(root, "", paths);
        return paths;
    }
}