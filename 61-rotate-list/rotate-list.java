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
    public static void print(ListNode dum)
    {
        while(dum!=null)
        {
            System.out.print(dum.val+"->");
            dum=dum.next;
        }
        System.out.println("null");
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy=head;
        int len=0;
        while(dummy!=null)
        {
            dummy=dummy.next;
            len++;
        }
        if (len==0)
        return null;
        else if(k==0)
        return head;
        k=k%len;
        int rotate=len-k;
        dummy=head;
        ListNode ans1=new ListNode(-1);
        ListNode dumans1=ans1;
        ListNode ans2=new ListNode(-1);
        ListNode dumans2=ans2;
        for(int i=0;i<rotate;i++)
        {
            dumans1.next=new ListNode(dummy.val);
            dumans1=dumans1.next;
            dummy=dummy.next;
        }
        while(dummy!=null)
        {
            dumans2.next=new ListNode(dummy.val);
            dumans2=dumans2.next;
            dummy=dummy.next;
    
        }
        ans1=ans1.next;
        dumans2.next=ans1;
        return ans2.next;
    }
}