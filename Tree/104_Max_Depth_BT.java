/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return helper(root, 0);
    }

    public int helper(TreeNode root, int len) {
        if(root == null) {
            return len;
        }

        int left = helper(root.left, len + 1);
        int right = helper(root.right, len + 1);

        return Math.max(left, right);
    }
}