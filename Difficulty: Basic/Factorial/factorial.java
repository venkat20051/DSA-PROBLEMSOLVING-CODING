//{ Driver Code Starts

// } Driver Code Ends

import java.util.*;

public class Main {
    public static int  fact(int n)
    {
        if(n==1 || n==0)
        return 1;
        else
        return n*fact(n-1);
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int ans=sc.nextInt();
        int sam=fact(ans);
        System.out.println(sam);
    }
}


//{ Driver Code Starts.
// } Driver Code Ends