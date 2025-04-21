//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public int altProduct(int[] arr) {
        // Your code goes here.
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int sum=0;
        while(i<j)
        {
            sum+=(arr[i]*arr[j]);
            i++;
            j--;
        }
        return sum;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.altProduct(arr);

            System.out.println(res);

            // System.out.println("~");
        }
    }
}

// } Driver Code Ends