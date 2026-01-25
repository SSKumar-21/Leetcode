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
        List<Integer> res = new ArrayList<>();
        return checking(root);
    }
    private int checking(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = checking(root.left);
        int r = checking(root.right);

        return Math.max(l,r) + 1;
    }
}
