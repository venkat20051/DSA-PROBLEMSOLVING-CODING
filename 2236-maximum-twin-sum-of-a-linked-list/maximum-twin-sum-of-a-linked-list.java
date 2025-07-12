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
    public int pairSum(ListNode head) {
        ListNode rev=new ListNode(0);
        ListNode dummy=head;
        int len=0;
        while(dummy!=null)
        {
            ListNode newNode=new ListNode(dummy.val);
            newNode.next=rev;
            rev=newNode;
            dummy=dummy.next;
            len++;
        }
        int ans=0;
        dummy=head;
        for(int i=0;i<=len/2;i++)
        {
            int val=dummy.val+rev.val;
            if(val>ans)
            ans=val;
            dummy=dummy.next;
            rev=rev.next;
        }
        return ans;
    }
}