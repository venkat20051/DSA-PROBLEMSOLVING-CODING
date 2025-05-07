//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countBits(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int countBits(int n) {
        // code here
        int total=0;
        for(int i=1;i<=n;i++)
        {
            int temp=i;
            while(temp!=0)
            {
                temp=(temp & (temp-1));
                total++;
            }
        }
        return total;
    }
}