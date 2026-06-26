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
         int max = 0;
         return getDepth(root,max);
    }
    int getDepth(TreeNode root, int max)    {
            if(root == null){
              return max;
            }
           return   1+ Integer.max(getDepth(root.left,max),getDepth(root.right,max)) ;
          
        }        
}
