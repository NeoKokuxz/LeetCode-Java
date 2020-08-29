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
            if(root == null){
                return true;
            }

            return check(root.left, root.right);
        }

        public boolean check(TreeNode left, TreeNode right){
            //Check if left & right null
            if(left == null || right == null){
                return left == right;
            }
            
            //Compare their value
            if(left.val != right.val){
                return false;
            }
            
            //Idea:
            //Compare left - left child to right - right child and left right - child to right - left child
            return check(left.left, right.right) && check(left.right, right.left);
        }
}
