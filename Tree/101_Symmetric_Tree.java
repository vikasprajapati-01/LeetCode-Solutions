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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }

        return helper(root.left, root.right);

        // Queue<TreeNode> queue = new LinkedList();
        // queue.add(root.left);
        // queue.add(root.right);

        // while(!queue.isEmpty()) {
        //     TreeNode left = queue.poll();
        //     TreeNode right = queue.poll();

        //     if(left == null && right == null) {
        //         continue;
        //     }
        //     if(left == null || right == null) {
        //         return false;
        //     }

        //     if(left.val != right.val) {
        //         return false;
        //     }

        //     queue.add(left.left);
        //     queue.add(right.right);
        //     queue.add(left.right);
        //     queue.add(right.left);
        // }

        // return true;
    }

    public boolean helper(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        }
        if(root1 == null || root2 == null) {
            return false;
        }

        return root1.val == root2.val && helper(root1.left, root2.right) && helper(root1.right, root2.left);
    }
}