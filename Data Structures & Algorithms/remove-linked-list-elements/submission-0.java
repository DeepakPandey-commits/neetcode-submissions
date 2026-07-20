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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = head;
        ListNode curr = head;
        while(curr != null){
            if(head.val == val){
                prev  = head.next;
                curr  = head.next;
                head = head.next;
            }
           curr = curr.next;
           else if(curr.val == val){
            prev.next = curr.next;
            curr.next = null;
            curr = prev.next;
           }else{
            curr = curr.next;
            prev = prev.next;
           }
           
        }
        return head;
    }
}