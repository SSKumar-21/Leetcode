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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null){
            return null;
        }
        int n = -1;
        ListNode temp = head;
        while (temp != null){
            n++;
            temp = temp.next;
        }
        if (n%2 != 0){
            //System.out.println(n);
            n++;
        }
        n = n/2;
        temp = head;
        ListNode temp2 = temp;
        while (temp != null){
            
            if(n==0){
                temp2.next = temp.next;
                break;
            }
            temp2 = temp;
            temp = temp.next;
            n--;
        }
        return head;
    }
}
