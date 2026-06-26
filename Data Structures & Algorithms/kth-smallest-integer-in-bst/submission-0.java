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
    public int kthSmallest(TreeNode root, int k) {
            
        List<Integer> list = new ArrayList<>();
        inOrder(root,list,k);
        return list.get(k-1);

    }

     public void inOrder(TreeNode node, List<Integer> list,int k){
         
        if(node != null){
            inOrder(node.left,list,k);
            list.add(node.val);
            inOrder(node.right,list,k);
        }
     }
               
}
