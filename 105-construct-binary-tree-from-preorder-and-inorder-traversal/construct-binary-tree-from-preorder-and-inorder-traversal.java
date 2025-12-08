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
    int prev;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        prev=0;
        int start=0;
        int end=preorder.length-1;
        return con(preorder,inorder,start,end);
    }
    public TreeNode con(int[] preorder,int[] inorder, int start,int end)
    {
        if(start>end)return null;
        TreeNode root=new TreeNode(preorder[prev++]);

        int ind=-1;
        for(int i=start;i<=end;i++)
        {
            if(inorder[i]==root.val)
            {
                ind=i;
                break;
            }
        }
        root.left=con(preorder,inorder,start,ind-1);
        root.right=con(preorder,inorder,ind+1,end);
        return root;
    }
}