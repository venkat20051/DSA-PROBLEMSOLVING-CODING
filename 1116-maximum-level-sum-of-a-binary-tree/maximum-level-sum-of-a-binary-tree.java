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
    public int maxLevelSum(TreeNode root) {
        int level=-1;
        int sum=Integer.MIN_VALUE;
        Queue<TreeNode> sample=new LinkedList<>();
        sample.add(root);
        int r=1;
        while(!sample.isEmpty())
        {
            int cursum=0;
            int n=sample.size();
            for(int i=0;i<n;i++)
            {
                TreeNode x=sample.poll();
                cursum+=x.val;
                if(x.left!=null)
                sample.add(x.left);
                if(x.right!=null)
                sample.add(x.right);

            }
            // System.out.println(cursum);
            if(cursum>sum)
            {
                sum=cursum;
                level=r;
            }
            r++;
        }
        return level;
    }
}