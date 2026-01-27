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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return Sum(root,low,high);
    }
    private int Sum(TreeNode root, int low, int high){
        if(root == null) return 0;
        int sum = 0;
        if(root.val <= high && root.val >= low) {
            sum = sum + root.val ;
        };
        return sum + (Sum(root.left,low,high) + Sum(root.right,low,high));
    }
}
