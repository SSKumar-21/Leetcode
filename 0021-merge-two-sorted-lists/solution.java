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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode res = new ListNode();
        ListNode res1 = res;

        while(temp1 != null && temp2 != null){
            ListNode temp = new ListNode();
            if(temp1.val < temp2.val){
                temp = temp1;
                temp1 = temp1.next;
            } else {
                temp = temp2;
                temp2 = temp2.next;
            }
            res.next = temp;
            res = temp;
        }

        while(temp1 != null){
            ListNode temp = new ListNode();
            temp = temp1;
            temp1 = temp1.next;
            res.next = temp;
            res = temp;
        }

        while(temp2 != null){
            ListNode temp = new ListNode();
            temp = temp2;
            temp2 = temp2.next;
            res.next = temp;
            res = temp;
        }

        return res1.next;
    }
}
