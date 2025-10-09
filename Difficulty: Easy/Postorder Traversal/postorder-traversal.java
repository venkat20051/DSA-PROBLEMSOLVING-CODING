/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> sample=new ArrayList<>();
        fun(root,sample);
        return sample;
    }
    public static void fun(Node root,ArrayList<Integer>sample)
    {
        if(root!=null)
        {
            fun(root.left,sample);
            fun(root.right,sample);
            sample.add(root.data);
        }
    }
}