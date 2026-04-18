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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode temp1 = head;

        for(int i=0;i<k;i++){
            if(temp1 == null) return head;
            temp1 = temp1.next;
        }

        ListNode temp2 = rev(head, temp1);
        head.next = reverseKGroup(temp1, k);
        return temp2;
    }
    private ListNode rev(ListNode head, ListNode temp){
        ListNode prev = null;
        while(head != temp){
            ListNode n = head.next;
            head.next = prev;
            prev = head;
            head = n;
        }
        return prev;
    }
}
