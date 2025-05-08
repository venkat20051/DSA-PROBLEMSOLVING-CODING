//{ Driver Code Starts

// } Driver Code Ends

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<st.length();i++)
        {
            if(i%2==0)
            str.append(st.charAt(i));
        }
        System.out.print(str.toString());
    }
}


//{ Driver Code Starts.
// } Driver Code Ends