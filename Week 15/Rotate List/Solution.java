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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next ==null || k==0 ) return head;

        ListNode curr = head;

        // step 1  -  calculate the  size of linked list
        int size = 1;
        while(curr.next!=null){
            size++;
            curr=curr.next;
        }

        // step 2  -  pointer curr to head of LL
        
        curr.next = head;

        k = k % size;
        k = size - k;

        // step 3  -  move curr til k > 0 and make head to curr.next and curr.next = null;

        while(k>0){
            curr=curr.next;
            k--;
        }
        
        // step - 4 

        head=curr.next;
        curr.next = null;

        return head;
    }
}