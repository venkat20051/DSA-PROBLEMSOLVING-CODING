//{ Driver Code Starts

// } Driver Code Ends
//Back-end complete function Template for Java
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
}

//{ Driver Code Starts.
// } Driver Code Ends