//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans = ob.printSubsets(N);
            for(int i: ans)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
    
    ArrayList<Integer> printSubsets(int N){
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<=N;i++)
        {
            if((N&i)==i)
            ans.add(i);
        }
        Collections.sort(ans,Collections.reverseOrder());
        return ans;
    }
    
}
