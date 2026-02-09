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
    public ListNode swapNodes(ListNode head, int k) {    
        // Method 2 
        ListNode temp = head;
        int length  = 0;
        while(temp!= null){
            length++;
             temp = temp.next;
             
        }
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1 ; i < k ; i++){
            slow = slow.next;
        }
        ListNode current = head;
        fast = slow;
        for(int i = 1; i <= length-k;i++){
            current = current.next;
            fast = fast.next;
        }
        int temp2 = slow.val;
        slow.val = current.val;
        current.val = temp2;
         
        return head;
        
    }
}