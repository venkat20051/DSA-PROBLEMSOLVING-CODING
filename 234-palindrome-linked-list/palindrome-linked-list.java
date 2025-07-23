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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null)
        return true;
        ListNode cur=head;
        Stack<Integer> str=new Stack<>();
        while(cur!=null)
        {
            str.push(cur.val);
            cur=cur.next;
        }
        cur=head;
        while(cur!=null)
        {
            if(!str.isEmpty() && str.peek()==cur.val)
            {
                str.pop();
            }
            else
            str.push(cur.val);
            cur=cur.next;
        }
        return str.isEmpty();
    }
}