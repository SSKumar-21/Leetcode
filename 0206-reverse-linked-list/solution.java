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
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode res = new ListNode();
        ListNode temp = head;
        while(temp!=null){
            res.val = temp.val;
            ListNode alt = new ListNode();
            alt.next = res;
            res = alt;
            temp = temp.next;
        }
        return res.next;
    }
}
