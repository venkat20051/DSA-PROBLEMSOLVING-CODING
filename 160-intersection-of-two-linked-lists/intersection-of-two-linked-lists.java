/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static void print(ListNode re)
    {
        while(re!=null)
        {
            System.out.print(re.val+"->");
            re=re.next;
        }
        System.out.println("null");
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> sam=new HashSet<>();
        while(headA!=null)
        {
          if(sam.contains(headA))
          return headA;
          else
          sam.add(headA);
          headA=headA.next;
        }
        while(headB!=null)
        {
         if(sam.contains(headB))
          return headB;
          else
          sam.add(headB);
          headB=headB.next;
        }
        return null;
    }
}