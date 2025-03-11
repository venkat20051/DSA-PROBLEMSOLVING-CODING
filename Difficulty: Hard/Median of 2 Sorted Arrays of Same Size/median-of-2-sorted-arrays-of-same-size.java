//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driver {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String arr1[] = br.readLine().split(" ");
            int[] a = new int[arr1.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(arr1[i]);

            String arr2[] = br.readLine().split(" ");
            int[] b = new int[arr2.length];

            for (int i = 0; i < arr2.length; i++) b[i] = Integer.parseInt(arr2[i]);

            if (b.length == 1 && b[0] == 0) {
                b = new int[0];
            }
            double res = new Solution().medianOf2(a, b);

            if (res == (int)res)
                System.out.println((int)res);
            else
                System.out.println(res);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        int i=0;
        int j=0;
        int n1=a.length;
        int n2=b.length;
        int[] arr=new int[n1+n2];
        int k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                arr[k]=a[i];
                i++;k++;
            }
            else
            {
                arr[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<n1)
        {
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=b[j];
            j++;
            k++;
        }
        int mid=(n1+n2)/2;
        // System.out.print(Arrays.toString(arr));
        // System.out.println(arr[mid]+" "+arr[mid+1]);
        double ans=(double)(arr[mid]+arr[mid-1])/2;
        return ans;
    }
}