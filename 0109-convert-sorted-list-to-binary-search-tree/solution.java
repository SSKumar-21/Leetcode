/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    List<Integer> l = new ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {
        while(head != null){
            l.add(head.val);
            head = head.next;
        }

        return make(0, l.size() -1);
    }
    private TreeNode make(int left , int right){
        if(left > right) return null;

        int mid = left + (right - left) / 2 ;

        int val = l.get(mid);

        TreeNode root = new TreeNode(val);

        root.left = make(left, mid - 1);
        root.right = make(mid +1, right);
        return root;
    }
}
