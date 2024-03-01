/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    if(list1==NULL)
        return list2;
    if(list2==NULL)
        return list1;
    struct ListNode *temp, *temp2;
    if(list1->val>list2->val){
        temp=list1;
        list1=list2;
        list2=temp;
    }
    struct ListNode *head=list1;

    while(list1!=NULL && list2!=NULL){
        temp2=NULL;
        while(list1!=NULL && list1->val<=list2->val){
            temp2=list1;
            list1=list1->next;
        }
        temp2->next=list2;
        temp=list1;
        list1=list2;
        list2=temp;
    }
    return head;
}