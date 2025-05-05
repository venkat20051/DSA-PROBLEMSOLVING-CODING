//{ Driver Code Starts
import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        // code here
     int sum=0;
     int n=arr.length;
     for(int i=0;i<n;i++)
     {
         sum+=arr[i];
     }
     int total=(arr[n-1]*(arr[n-1]+1))/2;
     return total-sum;
    }
}


//{ Driver Code Starts.

class GfG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends