/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int gcd(int a,int b) {
    while (b!=0) {
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
}

struct ListNode* insertGreatestCommonDivisors(struct ListNode* head) {
    if (head==NULL || head->next==NULL) {
        return head;
    }

    struct ListNode *temp=head;
    
    while(temp!=NULL && temp->next!=NULL) {
        int gcdValue= gcd(temp->val, temp->next->val);
        struct ListNode *newNode=malloc(sizeof(struct ListNode));
        newNode->val=gcdValue;
        newNode->next=temp->next;
        temp->next=newNode;
        temp=newNode->next;
    } 
    return head;
}

