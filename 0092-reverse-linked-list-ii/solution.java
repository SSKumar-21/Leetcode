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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;

        ArrayList<Integer> arr = new ArrayList<>();
        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }
        int l = left -1;
        int r = right-1;
        while(r>=l){
            int temp = arr.get(l);
            arr.set(l,arr.get(r));
            arr.set(r,temp);
            l++;
            r--;
        }
        ListNode res = new ListNode(0);
        ListNode tempRes = res;
        for(int i=0;i<arr.size();i++){
            ListNode temp = new ListNode(arr.get(i));
            tempRes.next = temp;
            tempRes = tempRes.next;
        }
        res = res.next;
        return res;
    }
}
