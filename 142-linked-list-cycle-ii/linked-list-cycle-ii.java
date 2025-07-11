/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
        return null;
        ListNode slow=head;
        ListNode fast=head;
        ListNode Start=head;
        int pos=0;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                do{
                    slow=slow.next;
                    pos++;
                }while(slow!=fast);
                break;
            }
        }
        if(pos==0)
        return null;
        slow=head;
        fast=head;
        while(pos>0)
        {
            slow=slow.next;
            pos--;
        }
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}