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
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        int ans=0;
        Queue<TreeNode> sample=new LinkedList<>();
        sample.add(root);
        while(!sample.isEmpty())
        {
            int size=sample.size();
            ans++;
            for(int i=0;i<size;i++)
            {
                TreeNode x=sample.poll();
                if(x.left!=null)
                sample.add(x.left);
                if(x.right!=null)
                sample.add(x.right);
            }
            
        }
        return ans;
    }
}