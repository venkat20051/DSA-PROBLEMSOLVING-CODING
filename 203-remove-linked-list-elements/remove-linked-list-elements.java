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
        ListNode cur=new ListNode(-1);
        ListNode curr=cur;
        // ListNode dummy=cur;
        while(head!=null)
        {
            if(head.val==val)
            {
            head=head.next;
            }
            else
            {
                ListNode newNode=new ListNode(head.val);
                curr.next=newNode;
                curr=curr.next;
                head=head.next;
            }
        }
        return cur.next;
    }
}