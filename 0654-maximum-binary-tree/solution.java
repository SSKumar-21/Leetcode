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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return Make(nums,0,nums.length - 1);
    }

    private TreeNode Make(int[] nums,int i,int j){
        if (i > j) return null;
        
        int max = nums[i];
        int idx = i;
        for(int k = i+1 ;k<=j;k++){
            if ( nums[k] > max ){
                max = nums[k];
                idx = k;
            }
        }
        TreeNode node = new TreeNode(nums[idx]);
        node.left = Make(nums,i,idx - 1);
        node.right = Make(nums,idx + 1,j);
        return node;
    }
}
