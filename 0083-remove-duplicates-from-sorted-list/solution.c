/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if (head == NULL) {return NULL;}
    
    struct ListNode *res=malloc(sizeof(struct ListNode));
    if(res==NULL){ return NULL;}
    
    struct ListNode *result=res;
    res->val=head->val;
    res->next = NULL;

    
    struct ListNode *temp=head;
    while(temp!=NULL){
        if(temp->next != NULL && temp->val != temp->next->val){
            struct ListNode *resTemp = malloc(sizeof(struct ListNode));
            if(resTemp==NULL){ return NULL;}
            
            resTemp->val=temp->next->val;
            resTemp->next=NULL;
            
            res->next=resTemp;
            res=resTemp;
        }
        temp=temp->next;
    }
    return result;
}
