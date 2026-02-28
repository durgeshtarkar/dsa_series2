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
    static ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        ListNode forward = null;
        while(current != null){
              forward = current.next;
              current.next = prev;
              prev = current;
              current = forward;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode a = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode b = slow.next;
        slow.next = null;
        b = reverse(b);
        
        ListNode t = head;
        while(a!=null && b!=null){
           a = t.next;
           t.next = b;
           t=b;
           b = t.next;
           t.next = a;
           t=a;
            
        }
    }
}