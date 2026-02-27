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
    static ListNode reverseList(ListNode head){
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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverseList(head2);
        // ListNode head2 = reverseList(slow);
        ListNode i = head;
        ListNode j = head2;
        while(j != null){
            if(i.val != j.val ) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
}