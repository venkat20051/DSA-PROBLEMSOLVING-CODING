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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(-1);
        ListNode dummy=ans;
        int carry=0;
        while(l1!=null && l2!=null)
        {
            int sum=carry+l1.val+l2.val;
            int rem=sum%10;
            carry=sum/10;
            ListNode newNode=new ListNode(rem);
            dummy.next=newNode;
            l1=l1.next;
            l2=l2.next;
            dummy=dummy.next;
        }
        while(l1!=null)
        {
            int sum=carry+l1.val;
            int rem=sum%10;
            carry=sum/10;
            ListNode newNode=new ListNode(rem);
            dummy.next=newNode;
            l1=l1.next;
            // l2=l2.next;
            dummy=dummy.next;
        }
        while(l2!=null)
        {
            int sum=carry+l2.val;
            int rem=sum%10;
            carry=sum/10;
            ListNode newNode=new ListNode(rem);
            dummy.next=newNode;
            // l1=l1.next;
            l2=l2.next;
            dummy=dummy.next;
        }
        if(carry!=0)
        {
            ListNode newNode=new ListNode(carry);
            dummy.next=newNode; 
        }
        // dummy.next=null;/
        return ans.next;

    }
}