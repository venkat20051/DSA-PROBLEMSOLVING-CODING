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
    public static void print(ListNode rev)
    {
        while(rev!=null)
        {
            System.out.print(rev.val+"->");
            rev=rev.next;
        }
        System.out.println("null");
    }
    public ListNode doubleIt(ListNode head) {
        ListNode rev=new ListNode(-1);
        ListNode dumrev=rev;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode newNode = new ListNode(temp.val);
            newNode.next=rev;
            rev=newNode;
            // rev=dumrev.next;
            temp=temp.next;
        }
        dumrev=rev;
        // print(dumrev);
        ListNode ans=new ListNode(0);
        ans=ans.next;
        int carry=0;
        // int first=200;
        while(dumrev!=null)
        {
            int sum=carry+dumrev.val*2;
            int rem=sum%10;
            carry=sum/10;
            ListNode newNode=new ListNode(rem);
            newNode.next=ans;
            ans=newNode;
            dumrev=dumrev.next;
            if(dumrev.val==-1)
            break;
        }
        if(carry!=0)
        {
            ListNode newNode=new ListNode(carry);
            newNode.next=ans;
            ans=newNode;
        }
        return ans;
    }
}