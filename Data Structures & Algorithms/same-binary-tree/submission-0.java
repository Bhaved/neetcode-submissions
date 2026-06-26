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
   
    boolean isSameTree(TreeNode subTree, TreeNode subRoot ){
              
              if(subTree == null && subRoot ==null){
                return true;
              }
              if(subTree == null || subRoot ==null){
                return false;
              }
              if( subTree.val == subRoot.val){
                return isSameTree(subTree.left, subRoot.left) &&  isSameTree(subTree.right, subRoot.right);   
              }else{
                return false;
              }
    }
}
