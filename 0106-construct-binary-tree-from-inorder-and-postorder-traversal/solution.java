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

    int postIdx;
    HashMap<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIdx = postorder.length - 1;
        for(int i =0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return make(postorder, 0, postorder.length -1 );
    }

    private TreeNode make(int[] postorder, int left, int right){
        if (left > right) {
            return null;
        }

        int rootVal = postorder[postIdx--];
        TreeNode root = new TreeNode(rootVal);

        int mid = map.get(rootVal);

        root.right = make(postorder, mid + 1, right);
        root.left = make(postorder, left, mid - 1);

        return root;
    }
}
