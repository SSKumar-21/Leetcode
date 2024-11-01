/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode *temp=malloc(sizeof(struct ListNode));
    temp->next=head;
    struct ListNode *current=temp; 

    while(current->next!=NULL){
        if(current->next->val==val) {
            struct ListNode *del = current->next;
            current->next=del->next;
            free(del);
        } else {
            current=current->next;
        }
    }

    return temp->next; 
}
