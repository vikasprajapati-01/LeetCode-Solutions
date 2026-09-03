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

    int cur = 1;
    int max = 0;
    int prev = Integer.MIN_VALUE;
    ArrayList<Integer> list = new ArrayList<>();
    // HashMap<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {
        helper(root);

        int[] ans = new int[list.size()];

        for(int i = 0; i<list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;

        // helper1(root);

        // int max = -1;
        // for(int each : map.values()) {
        //     max = Math.max(each, max);
        // }

        // ArrayList<Integer> list = new ArrayList<>();
        // for(int each : map.keySet()) {
        //     if(map.get(each) == max) {
        //         list.add(each);
        //     }
        // }

        // int[] ans = new int[list.size()];
        // for(int i = 0; i<list.size(); i++) {
        //     ans[i] = list.get(i);
        // }

        // return ans;
    }

    public void helper(TreeNode node) {
        if(node == null) {
            return;
        }

        helper(node.left);

        if(prev != Integer.MIN_VALUE && node.val == prev) {
            cur++;
        }
        else {
            cur = 1;
        }

        if(cur > max) {
            max = cur;
            list.clear();
            list.add(node.val);
        }
        else if(cur == max) {
            list.add(node.val);
        }

        prev = node.val;
        helper(node.right);

        return;
    }

    // public void helper2(TreeNode root) {
    //     if(root == null) {
    //         return;
    //     }

    //     map.put(root.val, map.getOrDefault(root.val, 0) + 1);

    //     helper2(root.left);
    //     helper2(root.right);

    //     return;
    // }
}