/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> sample = new LinkedList<>();
        sample.add(root);
        boolean flag=false;
        while(!sample.isEmpty())
        {
            int n=sample.size();
            ArrayList<Integer> each=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                Node x=sample.poll();
                each.add(x.data);
                if(x.left!=null)
                sample.add(x.left);
                if(x.right!=null)
                sample.add(x.right);
            }
            if(!flag)
            {
                for(int i=0;i<each.size();i++)
                {
                    ans.add(each.get(i));
                }
            }
            else
            {
                for(int i=each.size()-1;i>=0;i--)
                {
                     ans.add(each.get(i));
                }
            }
            flag=!flag;
        }
        return ans;
    }
}