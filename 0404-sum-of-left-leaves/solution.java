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
    public int sumOfLeftLeaves(TreeNode root) {
        
        return sum(root,0,false);
    }
    private int sum(TreeNode root, int sum, boolean lefty){
        if(root == null) return 0;
        if(root.left == null && root.right==null && lefty) return sum+root.val;

        int l = sum(root.left,sum, true);
        int r = sum(root.right,sum, false);

        return l+r;
    }
}
