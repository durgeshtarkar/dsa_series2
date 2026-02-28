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
        while(current!=null){
            forward = current.next;
            current.next = prev;
            prev = current;
            current = forward;

        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        ListNode i = head;
        ListNode j = head2;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(j!=null){
             sum = i.val + j.val ;
             i = i.next;
             j = j.next;
             max = Math.max(max,sum);
        }
        return max;
    }
}