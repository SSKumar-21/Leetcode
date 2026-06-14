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
    public int pairSum(ListNode head) {
        List<Integer> l = new ArrayList<>();

        ListNode temp = head;
        while (temp != null) {
            l.add(temp.val);
            temp = temp.next;
        }


        int j = l.size() - 1;

        int i = 0;

        int res = Integer.MIN_VALUE;

        while(i<j){
            res = Math.max(res, l.get(i) + l.get(j) );
            i++;
            j--;
        }

        return res;
    }
}
