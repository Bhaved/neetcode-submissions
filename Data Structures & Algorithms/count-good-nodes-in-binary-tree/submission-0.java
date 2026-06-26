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
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;

        int count = 1; // root is always a good node

        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.add(new Pair(root, root.val));

        while (!q.isEmpty()) {
            Pair<TreeNode, Integer> current = q.poll();
            TreeNode node = current.getKey();
            int maxVal = current.getValue();

            if (node.left != null) {
                int newMax = Math.max(maxVal, node.left.val);
                if (node.left.val >= maxVal) {
                    count++;
                }
                q.add(new Pair(node.left, newMax));
            }

            if (node.right != null) {
                int newMax = Math.max(maxVal, node.right.val);
                if (node.right.val >= maxVal) {
                    count++;
                }
                q.add(new Pair(node.right, newMax));
            }
        }

        return count;
    }
}
