//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            ArrayList<Integer> array2 = new ArrayList<Integer>();

            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            line = read.readLine();
            tokens = line.split(" ");
            for (String token : tokens) {
                array2.add(Integer.parseInt(token));
            }

            // ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr1 = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr1[idx++] = i;

            int[] arr2 = new int[array2.size()];
            idx = 0;
            for (int i : array2) arr2[idx++] = i;

            String v = new Solution().calc_Sum(arr1, arr2);

            // for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println(v);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    String calc_Sum(int arr1[], int arr2[]) {
        // Complete the function
        StringBuilder str=new StringBuilder();
        int i=arr1.length-1;
        int j=arr2.length-1;
        int carry=0;
        while(i>=0 && j>=0)
        {
            int sum=arr1[i]+arr2[j]+carry;
            int q=sum%10;
            carry=sum/10;
            char re=(char)(q + '0');
            // System.out.println(q+""+carry);
            str.insert(0,""+re);
            i--;
            j--;
        }
        while(i>=0)
        {
            int sum=arr1[i]+carry;
            int q=sum%10;
            carry=sum/10;
            char re=(char)(q+'0');
            str.insert(0,re);
            i--;
        }
         while(j>=0)
        {
            int sum=arr2[j]+carry;
            int q=sum%10;
            carry=sum/10;
            char re=(char)(q+'0');
            str.insert(0,re);
            j--;
        }
        if(carry!=0)
        str.insert(0,""+(char)(carry+'0'));
        return str.toString();
    }
}
