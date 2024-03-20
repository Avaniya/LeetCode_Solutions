/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode one=list1;
        for(int i=1;i<a;i++){
            one=one.next;
        }
        ListNode two=one;
        for(int i=a;i<=b;i++){
            two=two.next;
        }
        one.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=two.next;
        return list1;
    }
}