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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> sample=new ArrayList<>();
        if(head==null)
        return null;
        while(head!=null)
        {
            sample.add(head.val);
            head=head.next;
        }
        int n=sample.size();
        return gen(sample,0,n-1);
    }
    public static TreeNode gen(ArrayList<Integer>sample,int low,int  high)
    {
        if(low>high)
        return null;
        if(low==high)
        return new TreeNode(sample.get(low));
        int mid=(low+high)/2;
        TreeNode root=new TreeNode(sample.get(mid));
        root.left=gen(sample,low,mid-1);
        root.right=gen(sample,mid+1,high);
        return root;
    }
}