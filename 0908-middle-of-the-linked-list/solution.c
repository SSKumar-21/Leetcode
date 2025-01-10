/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    int size=0;
    struct ListNode *temp=head;
    while(temp!=NULL){
        temp=temp->next;
        size++;
    }
    int mid=((int)(size/2))/+1;
    temp=head;
    for(int i=0;i<mid;i++){
        temp=temp->next;
    }
    return temp;
}
