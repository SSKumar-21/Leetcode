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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        leaf(root,res,"");
        return res;
    }
    private void leaf(TreeNode root, List<String> res, String s){
        if(root == null) return;
        
        if (s.length() == 0) {
            s = String.valueOf(root.val);
        } else {
           s = s + "->" + root.val;
        }

        if(root.left == null && root.right==null){
            res.add(s);
            return;
        }

        leaf(root.left,res,s);
        leaf(root.right,res,s);
    }
}
