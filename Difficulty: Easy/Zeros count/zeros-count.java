//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (long i : array) arr[idx++] = (int)i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.countZeroes(arr));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
        // code here
        int low=0;
        int high=arr.length-1;
        int fr=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==0)
            {
                if(mid==0 || arr[mid]!=arr[mid-1])
                {
                    fr=mid;
                    break;
                }
                else
                {
                    high=mid-1;
                }
            }
            else
            {
                low=mid+1;
            }
            
        }
        if(fr==-1)
        return 0;
        else
        return arr.length-fr;
        
    }
}
