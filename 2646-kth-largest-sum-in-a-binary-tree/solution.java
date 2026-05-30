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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) return -1;

        long sum =0;
        Queue<TreeNode> q = new LinkedList<>();
        List<Long> l = new ArrayList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr = q.remove();

            if(curr == null){
                l.add(sum);
                if (q.isEmpty()) break;
                else {
                    q.add(null);
                    sum = 0;
                }
            } else {
                sum += curr.val;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        Collections.sort(l, Collections.reverseOrder());

        if (k > l.size()) return -1;
        else return l.get(k -1);
    }
}
