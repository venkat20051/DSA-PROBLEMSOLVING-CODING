// User function Template for Java

class Solution{
    static Stack<Integer> deleteMid(int n, Stack<Integer> st)
    {
        // code here
        int mid=n/2;
        Stack<Integer> ans=new Stack<>();
       int start=0;
       while(!st.isEmpty())
       {
           if(mid==start)
           {
               st.pop();
           }
           else
           {
               int x=st.pop();
               ans.push(x);
           }
           start++;
       }
       while(!ans.isEmpty())
       {
           st.push(ans.pop());
       }
    //   System.out.println(ans);
       return st;
    }
}