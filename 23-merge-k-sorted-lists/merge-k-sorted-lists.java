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
    static ListNode merge(ListNode head1 , ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode a = head1;
        ListNode b = head2;
        while(a!=null && b!=null){
        if(a.val <= b.val){
            t.next = a;
            t = a;
            a = a.next;
        }else{
            t.next = b;
            t = b;
            b = b.next;
        }
        }
        if(a!=null)  t.next = a;
        if(b!=null) t.next = b;
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> arr = new ArrayList<>();
        for(ListNode node : lists){
            arr.add(node);
        }
        if(arr.size()==0) return null;
        while(arr.size() > 1){
            ListNode a = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c =  merge(a,b);
            arr.add(c);
        }
        return arr.get(0);
    }
}