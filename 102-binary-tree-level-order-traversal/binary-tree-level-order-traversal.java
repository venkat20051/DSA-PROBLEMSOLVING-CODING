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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        return ans;
        Queue<TreeNode> sample=new LinkedList<>();
        sample.add(root);
        while(!sample.isEmpty())
        {
            int size=sample.size();
            ArrayList<Integer> sub=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode x=sample.poll();
                sub.add(x.val);
                if(x.left!=null)
                sample.add(x.left);
                if(x.right!=null)
                sample.add(x.right);
            }
            ans.add(sub);
        }
        return ans;
    }
}