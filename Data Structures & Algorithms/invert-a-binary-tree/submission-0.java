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
//1, 3,2
class Solution {
    public TreeNode invertTree(TreeNode root) {
          if(root == null){
            return root;
          }
          TreeNode right = null; 
          TreeNode left  = null;
          if(root.left != null){
             right =root.left;
             invertTree(root.left);
          }if(root.right != null){
             left =root.right;
            invertTree(root.right);
          }
          root.right = right;
          root.left = left;
        return root;
    }
}
