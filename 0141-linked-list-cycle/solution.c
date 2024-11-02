/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    if (head==NULL || head->next==NULL) {
        return false;
    }
    struct ListNode *temp1=head,*temp2=head->next;
    while (temp2 != NULL && temp2->next!=NULL) {
        if (temp1==temp2) {
            return true;
        }
        temp1=temp1->next;
        temp2=temp2->next->next;
    }
    return false;
}
