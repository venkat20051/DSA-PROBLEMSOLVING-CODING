//{ Driver Code Starts

// } Driver Code Ends

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Your Code Here
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
        System.out.println(a);
        if(n==1)
        System.out.println(b);
        else
        {
            for(int i=0;i<=n-2;i++)
            {
                int temp=a+b;
                a=b;
                b=temp;
            }
            System.out.println(b);
        }
        
    }
}


//{ Driver Code Starts.
// } Driver Code Ends