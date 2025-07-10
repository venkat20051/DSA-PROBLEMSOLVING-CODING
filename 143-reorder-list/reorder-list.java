// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
class Solution {
    public static void print(ListNode re)
    {
        while(re!=null)
        {
            System.out.print(re.val+"->");
            re=re.next;
        }
    }
    public void copyListContent(ListNode target, ListNode source) {
        while (target != null && source != null) {
            target.val = source.val;
            target = target.next;
            source = source.next;
        }
    }

    public void reorderList(ListNode head) {
        ListNode rev=new ListNode(-1);
        ListNode dumrev=rev;
        ListNode dumhed=head;
        int len=0;
        while(dumhed!=null)
        {
            ListNode newNode =new ListNode(dumhed.val);
            newNode.next=rev;
            rev=newNode;
            // rev=rev.next;
            dumhed=dumhed.next;
            len++;
        }
       
        // System.out.println(len);
        dumhed=head;
        dumrev=rev;
        // print(dumhed);
        ListNode ans=new ListNode(-1);
        ListNode dumans=ans;
        for(int i=0;i<len;i++)
        {
            if((i%2)==0)
            {
                ListNode newNode=new ListNode(dumhed.val);
                // newNode.next=ans;
                dumans.next=newNode;
                dumans=dumans.next;
                dumhed=dumhed.next;
            }
            else
            {
                ListNode newNode=new ListNode(dumrev.val);
                // newNode.next=ans;
                dumans.next=newNode;
                dumans=dumans.next;
                dumrev=dumrev.next;
            }
            // len--;
        }
        // print(ans.next);
        copyListContent(head, ans.next);
    }
}



