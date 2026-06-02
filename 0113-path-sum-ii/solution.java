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

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        adding(root, targetSum, new ArrayList<>(), 0);

        return res;
    }

    private void adding(TreeNode root, int targetSum, List<Integer> l, int sum) {
        if(root == null) return;

        sum += root.val;
        l.add(root.val);

        if(root.left == null && root.right == null && sum == targetSum) {
            res.add(new ArrayList<>(l));
        }

        adding(root.left, targetSum, l, sum);
        adding(root.right, targetSum, l, sum);

        l.remove(l.size() - 1);
    }
}
