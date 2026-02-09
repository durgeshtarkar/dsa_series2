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
    public ListNode middleNode(ListNode head)  {
       // METHOD 2 -> SLOW/FAST APPROACH
       ListNode slow = head;
       ListNode fast = head;
       while(fast!=null && fast.next != null){ //fast.next != null  &&   fast!=null -> hum aese nhi likh skte kyunki and me agr pehli condiion sahi nhi hoti to dusri check nhi hoti to isse fast condition jo (fst pehle fast.next se) vo check nhi hoga to null pointer exception aajaega.  fast.next!=null => odd length , fast!= null for even length
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow; 
    }
}