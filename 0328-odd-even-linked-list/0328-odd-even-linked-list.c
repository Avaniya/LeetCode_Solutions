/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* oddEvenList(struct ListNode* head) {
    if (head==NULL){
        return head;
    }
    struct ListNode* odd=head;
    if(head->next){
    struct ListNode* even=head->next;
    struct ListNode* evenhead=even;
    

    while(odd->next && even->next){
        odd->next=odd->next->next;
        even->next=even->next->next;

        odd=odd->next;
        even=even->next;

    }
    

    odd->next=evenhead;
    }
    return head;
}