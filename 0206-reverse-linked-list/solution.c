/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
     struct ListNode *temp1=NULL,*temp2=NULL;
   
   while (head!=NULL){
       temp1=head->next;
       head->next=temp2;
       temp2=head;
       head=temp1;
   }
    return temp2;
}
