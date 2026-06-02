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
    int peridx = 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i =0 ;i<inorder.length;i++){
            map.put(inorder[i], i );
        }
        return make(preorder, 0, preorder.length - 1);
    }

    private TreeNode make(int[] preorder, int left , int right){
        if(left > right ) return null;

        int val = preorder[peridx++];
        int mid = map.get(val);

        TreeNode root = new TreeNode(val);

        root.left = make(preorder,left, mid - 1 );
        root.right = make(preorder,mid+1,right);
        return root;
    }
}
