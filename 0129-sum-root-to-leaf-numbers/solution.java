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
     
    int sum = 0;
     
    public int sumNumbers(TreeNode root) {
        ad(root, 0 );
        return sum;
    }
    private void ad(TreeNode root,int d){
        if(root == null){
            return ;
        }

        d = d*10 + root.val;

        if(root.left == null && root.right==null){
            sum += d;
        }

        ad(root.left,d);
        ad(root.right,d);

    }
}
