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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        ListNode curr = head;
        while(curr!=null){
            if(map.containsKey(curr.val)){
                int c = map.get(curr.val);
                map.put(curr.val,c+1);
            } else {
                map.put(curr.val,1);
            }
            curr = curr.next;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                arr.add(entry.getKey());
            }
        }
        
        Collections.sort(arr);

        ListNode res = new ListNode(0);
        curr = res ;
        for(int i=0 ;i<arr.size();i++){
            ListNode temp = new ListNode(arr.get(i),null);
            curr.next = temp;
            curr = curr.next;
        }
        res = res.next;
        return res;
    }
}
