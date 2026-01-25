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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        inorder(p,res1);
        inorder(q,res2);
        return res1.equals(res2);
    }
    private void inorder(TreeNode root,List<Integer> res){
        if (root == null){
            res.add(null);
            return;
        }
        res.add(root.val);
        inorder(root.left,res);
        inorder(root.right,res);
    }
}
