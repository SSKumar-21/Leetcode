/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    if(head==NULL){
        return NULL;
    }
    if(head->next==NULL){
        free(head);
        return NULL;
}

    int count=1;
    struct ListNode *new=head;
    while(new->next!=NULL){
        new=new->next;
        count++;
    }

    count-=n;

    if (count==0) {
        new = head;
        head = head->next;
        free(new);
        return head;
    }

    new=head;
    while(count>1){
        new=new->next;
        count--;
    }

    struct ListNode *nodeToRemove = new->next;
    new->next = nodeToRemove->next; 
    free(nodeToRemove);
    new=NULL;
    free(new);
    return head;
}
