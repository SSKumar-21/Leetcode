/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
     int c=0;
    struct ListNode* temp1=malloc(sizeof(struct ListNode));
    struct ListNode* temp2=temp1;
    temp1->next=NULL;

    while (l1!=NULL || l2!=NULL || c>0) {
        int sum=c;
        if (l1!=NULL) {
            sum+=l1->val;
            l1=l1->next;
        }

        if (l2!=NULL) {
            sum+=l2->val;
            l2=l2->next;
        }

        c = sum / 10;
        struct ListNode* newNode=malloc(sizeof(struct ListNode));
        newNode->val=sum % 10;
        newNode->next=NULL;
        temp2->next=newNode;
        temp2=newNode;
    }

    return temp1->next;
}
