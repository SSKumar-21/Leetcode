/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeNodes(struct ListNode* head) {
    struct ListNode *temp=head->next,*newHead=NULL,*prev=NULL;
    int sum=0;
    while(temp!=NULL){
        if(temp->val!=0){
            sum+=temp->val;
        } else{
            if(sum!=0){
            struct ListNode *newNode=malloc(sizeof(struct ListNode));
            newNode->val=sum;
            newNode->next=NULL;
            if(newHead==NULL){
                newHead=newNode;
            } else {
                prev->next=newNode;
            }
            prev=newNode;
        }
           sum=0;
        }
        temp=temp->next;
    }
    free(temp);
    return newHead;
}
