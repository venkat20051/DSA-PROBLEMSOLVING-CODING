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
    public static void print(ListNode res)
    {
        while(res!=null)
        {
            System.out.print(res.val+"->");
            res=res.next;
        }
        System.out.println("null");
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode slow=new ListNode(-1,head);
        slow=slow.next;
        ListNode dumslow=slow;
        ListNode cur=head;
        ListNode ans=new ListNode(-1);
        ListNode dumans=ans;
        int count=0;
        while(cur!=null)
        {
            if(count==k)
            {
                // dumslow.next=null;
                ListNode temp=cur;
                // System.out.print("temp: ");
                // print(temp);
                ListNode rev=new ListNode(-1);
                rev=rev.next;
                while(slow!=dumslow)
                {
                    ListNode newNode=new ListNode(slow.val);
                    newNode.next=rev;
                    rev=newNode;
                    slow=slow.next;
                }
                // System.out.print("rev: ");
                // print(rev);
                // rev.next=null;
                dumans.next=rev;
                while(dumans.next!=null)
                dumans=dumans.next;
                // dumans=rev;
                // System.out.print("ans: ");
                // print(ans);
                slow=temp;
                dumslow=slow;
                count=0;
            }
            count++;
            cur=cur.next;
            dumslow=dumslow.next;
            // print(cur);
            // System.out.println(count);
        }
        if(count==k)
        {
            ListNode rev=new ListNode(-1);
            rev=rev.next;
            while(slow!=dumslow)
            {
                ListNode newNode=new ListNode(slow.val);
                newNode.next=rev;
                rev=newNode;
                slow=slow.next;
            }
            dumans.next=rev;
            while(dumans.next!=null)
            dumans=dumans.next;
        }
        if(slow!=null)
        dumans.next=slow;
        return ans.next;
    }
}