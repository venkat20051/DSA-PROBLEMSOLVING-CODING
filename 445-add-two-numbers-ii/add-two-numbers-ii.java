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
    public static void print(ListNode re)
    {
        while(re!=null)
        {
            System.out.print(re.val+"->");
            re=re.next;
        }
        System.out.println("null");
    }
    public static ListNode reverse(ListNode cur)
    {
        ListNode dummy=cur;
        ListNode rev=new ListNode(-1);
        // ListNode dumrev=rev;
        while(cur!=null)
        {
            ListNode newNode=new ListNode(cur.val);
            newNode.next=rev;
            rev=newNode;
            cur=cur.next;
        }
        // print(rev);
        return rev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode ans=new ListNode(-1);
        ans=ans.next;
        // ListNode dummy=ans;
        int carry=0;
        while(l1.val!=-1 && l2.val!=-1)
        {
            int sum=carry+l1.val+l2.val;
            int rem=sum%10;
            carry=sum/10;
            ListNode newNode=new ListNode(rem);
            newNode.next=ans;
            ans=newNode;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1.val!=-1)
        {
            int sum=carry+l1.val;
            int rem=sum%10;
            carry=sum/10;
            ListNode newNode=new ListNode(rem);
            newNode.next=ans;
            ans=newNode;
            l1=l1.next;
        }
        while(l2.val!=-1)
        {
            int sum=carry+l2.val;
            int rem=sum%10;
            carry=sum/10;
            ListNode newNode=new ListNode(rem);
            newNode.next=ans;
            ans=newNode;
            l2=l2.next;
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