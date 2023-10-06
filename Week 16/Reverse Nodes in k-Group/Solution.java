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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1) return head;
        ListNode d = new ListNode(0, head), _node, c, lnode, t;
        int n=0;
        for(t=head;t!=null;n++, t=t.next); // counting no. of nodes
        
        for(int j=0;j<n/k;j++){
            _node=d.next; c=_node.next; lnode=d.next;
            for(int i=1;i<k;i++){ // reversing k-nodes
                t=c.next;
                c.next=_node;
                _node=c;
                c=t;
            }
            lnode.next=c; // fixing head and tail
            d.next=_node;
            d=lnode;
            if(j==0) head=_node; // fixing the head
        }
        return head;
    }
}