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
    public int minDepth(TreeNode root) {
        return checking(root);
    }
    private int checking(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = checking(root.left);
        int r = checking(root.right);
        
        if(l==0) return 1+r;
        if(r == 0) return 1+l;

        return Math.min(l,r) + 1;
    }
}
