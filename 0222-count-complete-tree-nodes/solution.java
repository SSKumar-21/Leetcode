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
    public int countNodes(TreeNode root) {
        return count(root);
    }
    private int count(TreeNode root){
        if(root == null) return 0;
        int l = getLeft(root);
        int r = getRight(root);

        if(l == r){
            return ( (2<<l) - 1);
        } else {
            return 1 + count(root.left) + count(root.right);
        }
    }
    private int getLeft(TreeNode root){
        int i=0;
        while(root.left != null){
            i++;
            root = root.left;
        }
        return i;
    }
    private int getRight(TreeNode root){
        int i=0;
        while(root.right != null){
            i++;
            root = root.right;
        }
        return i;
    }
}
