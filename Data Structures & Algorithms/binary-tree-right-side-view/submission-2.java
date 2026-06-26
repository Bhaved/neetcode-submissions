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
    public List<Integer> rightSideView(TreeNode root) {
        
         List<Integer> list = new ArrayList<>();
         if(root == null){
            return list;
         }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
       
        while(!q.isEmpty()){
             boolean firstAdded = false;
            for(int i = q.size(); i>0; i--){
                TreeNode node = q.poll();
                if(!firstAdded){
                    list.add(node.val);
                    firstAdded = true;
                }
                if(node != null){
                    if(node.right != null){
                        q.add(node.right);
                    }
                    if(node.left != null){
                        q.add(node.left);
                    }
                }

                }                 
        }
        return list;

    }
}

