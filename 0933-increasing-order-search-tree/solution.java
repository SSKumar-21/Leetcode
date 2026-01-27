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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        make(root, arr);
        TreeNode res = new TreeNode(arr.get(0));
        TreeNode result = res;
        for(int i=1 ; i<arr.size() ; i++){
            res.right = new TreeNode(arr.get(i));
            res = res.right;
        }
        return result;
    }
    private void make(TreeNode root,List<Integer> res){
        if (root == null) return;
        make(root.left,res);
        res.add(root.val);
        make(root.right,res);
    }
}
