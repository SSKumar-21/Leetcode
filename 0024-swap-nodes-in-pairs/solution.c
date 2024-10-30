/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head) {
    if (head == NULL || head->next == NULL) {
        return head;
    }
    
	struct ListNode* temp1=head;
	struct ListNode* temp2=head->next;
	
	temp1->next = temp2->next; 
    temp2->next = temp1;
    
    temp1->next=swapPairs(temp1->next);
	
	return temp2;
}
