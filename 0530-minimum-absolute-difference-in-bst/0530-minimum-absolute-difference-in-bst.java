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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> i = new ArrayList<>();
        listing(root, i);

        int res = Math.abs(i.get(0) - i.get(1));
        for(int k = 2;k<i.size();k++){
            res = Math.min( res, Math.abs(i.get(k-1) - i.get(k)) );
        }
        return res;
    }

    private void listing(TreeNode root,List<Integer> i){
        if(root == null) return;

        listing(root.left, i);
        i.add(root.val);
        listing(root.right, i);
    }
}