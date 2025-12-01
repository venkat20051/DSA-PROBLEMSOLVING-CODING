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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> sample=new LinkedList<>();
        ArrayList<Integer> sam=new ArrayList<>();
        if(root==null)
        return sam;
        sam.add(root.val);
        sample.add(root);
        while(sample.size()>0)
        {
            int n=sample.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                TreeNode x=sample.poll();
                if(x.left!=null)
                {
                    sample.add(x.left);
                    max=Math.max(x.left.val,max);
                }
                if(x.right!=null)
                {
                    sample.add(x.right);
                    max=Math.max(x.right.val,max);
                }
            }
            if(sample.size()>0)
            sam.add(max);
        } 
        return sam;
    }
}