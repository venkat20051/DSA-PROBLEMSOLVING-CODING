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
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        // int[] sample=new int[2];
        int[] cut=avg(root);
        return ans;
    }
    int[] avg(TreeNode root)
    {
        if(root==null)
        {
            return new int[2];
        }
        int[] left=avg(root.left);
        int[] right=avg(root.right);
        int[] sample=new int[2];
        int sum=root.val+left[0]+right[0];
        int count=left[1]+right[1]+1;
        if((int)sum/count==root.val)
        {
            ans++;
        }
        sample[0]=sum;
        sample[1]=count;
        
        return sample;

    }
}