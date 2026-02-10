/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA;
        ListNode node2 = headB;
        int length1 = 0;
        int length2 = 0;
        while(node1!=null){
            length1++;
            node1 = node1.next;
        }
        while(node2!=null){
            length2++;
            node2 = node2.next;
        }
        node1 = headA;
        node2 = headB;
        if(length1 > length2){
            for(int i = 1; i <= length1-length2 ; i++){
            node1 = node1.next;
            }
        }
        if(length2>length1){
            for(int i = 1; i <= length2-length1 ; i++){
            node2 = node2.next;
        }
        }
        while(node1!=node2){
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
        
    }
}