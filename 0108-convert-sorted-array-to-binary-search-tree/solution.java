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
    public TreeNode sortedArrayToBST(int[] nums) {
        return making(nums,0,nums.length - 1);
    }

    private TreeNode making(int[] nums,int left,int right){
        if(left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode res = new TreeNode(nums[mid]);

        res.left = making(nums,left,mid-1);
        res.right = making(nums,mid+1,right);

        return res;
    }
}
