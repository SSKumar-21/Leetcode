/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) {
     struct ListNode* slow = head;
    struct ListNode* fast = head;

    // Detect the cycle using the two-pointer approach
    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;

        // If slow and fast meet, a cycle exists
        if (slow == fast) {
            break;
        }
    }

    // If no cycle, return NULL
    if (fast == NULL || fast->next == NULL) {
        return NULL;
    }

    // Find the start of the cycle
    while (head != slow) {
        head = head->next;
        slow = slow->next;
    }

    return slow; // Start of the cycle
}
