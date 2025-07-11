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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy=head;
        ListNode odd=new ListNode(-1);
        ListNode even=new ListNode(-1);
        ListNode dumodd=odd;
        ListNode dumeven=even;
        int i=1;
        while(dummy!=null)
        {
            if(i%2!=0)
            {
                dumodd.next=new ListNode(dummy.val);
                dumodd=dumodd.next;
            }
            else
            {
                dumeven.next=new ListNode(dummy.val);
                dumeven=dumeven.next;
            }
            i++;
            dummy=dummy.next;

        }
       
        // odd.next=null;
        // even.next=null;
        ListNode ans=new ListNode(-1);
        ListNode dumans=ans;
        odd=odd.next;
        even=even.next;
        //    print(odd);
        // print(even);
     
        while(odd!=null)
        {
            dumans.next=new ListNode(odd.val);
            dumans=dumans.next;
            odd=odd.next;
        }
        while(even!=null)
        {
            dumans.next=new ListNode(even.val);
            dumans=dumans.next;
            even=even.next;
        }
        return ans.next;
    }
}