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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(-1,head);
        ListNode dummy2=dummy;
        while(head!=null)
        {
            if(head.next!=null && head.val==head.next.val)
            {
             while(head.next!=null && head.val==head.next.val)
             head=head.next;

             dummy2.next=head.next;
            }
            else
            {
                dummy2=dummy2.next;
            }
            head=head.next;
            
        }
        // dummy.next=null;
        return dummy.next;
    }
}