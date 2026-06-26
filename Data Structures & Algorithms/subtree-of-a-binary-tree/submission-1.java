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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

            if(root == null && subRoot == null){
              return true;
            }
            if(root == null || subRoot == null){
              return false;
            }
             
               if(compareTree(root, subRoot)){
                return true;
               }
            

          return compareTree(root.left,subRoot) ||isSubtree(root.right, subRoot);

    }

    boolean compareTree(TreeNode subTree, TreeNode subRoot ){
              
              if(subTree == null && subRoot ==null){
                return true;
              }
              if(subTree == null || subRoot ==null){
                return false;
              }
              if( subTree.val == subRoot.val){
                return compareTree(subTree.left, subRoot.left) &&  compareTree(subTree.right, subRoot.right);   
              }else{
                return false;
              }
    }

}