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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        return ans;

        Queue<TreeNode> sample=new LinkedList<>();
        sample.add(root);
        boolean zig=true;
        while(!sample.isEmpty())
        {
            int size=sample.size();
            ArrayList<Integer> subarray=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode x=sample.poll();
                subarray.add(x.val);

                if(x.left!=null)
                sample.add(x.left);
                if(x.right!=null)
                sample.add(x.right);
            }
            // System.out.println(zig);
            
            if(!zig)
            {
                Collections.reverse(subarray);
                ans.add(subarray);
            }
            else
            ans.add(subarray);
            zig=!zig;
        }
        return ans;

    }
}