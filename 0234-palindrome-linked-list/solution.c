/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode *new1=NULL;
    struct ListNode *new2=NULL;
    while (head != NULL) {
        new2=head->next;
        head->next=new1;
        new1=head;
        head=new2;
    }
    return new1;
}

bool isPalindrome(struct ListNode* head) {
    if (head==NULL || head->next==NULL) {
        return true;
}
    struct ListNode *temp2=head;
    struct ListNode *temp1=head;
    
    while (temp1!=NULL && temp1->next!=NULL) {
        temp2=temp2->next;
        temp1=temp1->next->next;
    }

    struct ListNode *secondHalf=reverseList(temp2);
    struct ListNode *firstHalf=head;
    struct ListNode *secondHalfCopy=secondHalf;

    bool palindrome=true;
    while (secondHalf!=NULL) {
        if (firstHalf->val != secondHalf->val) {
            palindrome = false;
            break;
        }
        firstHalf=firstHalf->next;
        secondHalf=secondHalf->next;
    }

    reverseList(secondHalfCopy); 

    return palindrome;
}
