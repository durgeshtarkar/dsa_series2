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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    // METHOD 2
    ListNode slow = head;
    ListNode fast = head;
    ListNode prevslow = null;
    if(head==null || head.next==null) return null;
    for(int i = 1; i <= n ;i++){
        fast = fast.next;
         if(fast==null){
           slow = slow.next;
           return slow;
        }
    }
    
    while(fast!=null){
        prevslow = slow;
        slow = slow.next;
        fast = fast.next;
    }
    prevslow.next = slow.next;

    return head;
    }
}