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
    public ListNode deleteMiddle(ListNode head) {
        //method second 
        if(head==null || head.next == null) return null;
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        ListNode prevtemp = null;
        temp = head;
        for(int i = 0 ; i <length/2 ; i++){
            prevtemp = temp;
            temp = temp.next;
        }
        prevtemp.next = temp.next;

        return head;
    }
}