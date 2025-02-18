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
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public void merge(int arr[],int l,int mid,int r)
    {
        int low=mid-l+1;
        int high=r-mid;
        int[] left=new int[low];
        int[] rigth=new int[high];
        for(int i=0;i<low;i++)
        {
            left[i]=arr[l+i];
        }
        for(int i=0;i<high;i++)
        {
            rigth[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=l;
        while(i<low && j<high)
        {
            if(left[i]<=rigth[j])
            {
                arr[k]=left[i];k++;i++;
            }
            else
            {
                arr[k]=rigth[j];j++;k++;
            }
        }
        while(i<low)
        {
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<high)
        {
            arr[k]=rigth[j];k++;j++;
        }
        
    }
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(r>l)
        {
            int mid=l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
}
