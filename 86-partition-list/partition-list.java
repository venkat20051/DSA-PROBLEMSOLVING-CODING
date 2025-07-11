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
    public static void print(ListNode r){
        while(r!=null)
        {
            System.out.print(r.val+"->");
            r=r.next;
        }
        System.out.println("null");
    }
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(-1);
        ListNode dumsmall=small;
        ListNode big=new ListNode(-1);
        ListNode dumbig=big;
        ListNode dumhead=head;
        while(dumhead!=null)
        {
            if(dumhead.val<x)
            {
                dumsmall.next=dumhead;
                dumsmall=dumsmall.next;
            }
            else
            {
                dumbig.next=dumhead;
                dumbig=dumbig.next;
            }
            dumhead=dumhead.next;
        }    
        dumbig.next=null;
        dumsmall.next=null;
        
        ListNode ans=new ListNode(-1);
        ListNode dumasn=ans;
        small=small.next;
        big=big.next;
        // print(small);
        // print(big);
        while(small!=null)
        {
            dumasn.next=small;
            dumasn=dumasn.next;
            small=small.next;
        }  
        while(big!=null)
        {
            dumasn.next=big;
            dumasn=dumasn.next;
            big=big.next;
        } 
        return ans.next;
    }
}