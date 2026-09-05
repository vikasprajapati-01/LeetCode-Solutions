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

    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null) {
            return 0;
        }

        PriorityQueue<Long> queue = new PriorityQueue<>();
        // PriorityQueue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();

            long sum = 0;
            for(int i = 0; i<size; i++) {
                TreeNode cur = q.poll();

                sum += (long)cur.val;

                if(cur.left != null) {
                    q.add(cur.left);
                }
                if(cur.right != null) {
                    q.add(cur.right);
                }
            }

            queue.add(sum);
        }

        if(queue.size() < k) {
            return -1;
        }

        // for(int i = 1; i < k; i++) {
        //     queue.poll();
        // }

        int size = queue.size() - k;
        for(int i = 0; i < size; i++) {
            queue.poll();
        }

        return queue.peek();
    }
}