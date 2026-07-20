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
    public ListNode mergeSort(ListNode head1 , ListNode head2){
        ListNode result = null;
        //Base Case
        if(head1 == null){
            result =  head2;
        }else if(head2 == null){
            result = head1;
        }else if(head1.val <= head2.val){
            result = head1;
            result.next = mergeSort(head1.next, head2);
        }else{
            result = head2;
            result.next = mergeSort(head1 , head2.next);
        }
        return result;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int last = lists.length-1;
        
        while(last != 0){
            int i=0;
            int j = last;
            while(i<j){
                lists[i] = mergeSort(lists[i], lists[j]);
                i++;
                j--;
                if(i>=j){
                    last = j;
                }
            }
        }
        return lists[0];
    }
}
