//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                String temp[] = br.readLine().trim().split(" ");
                arr[i][0] = Integer.parseInt(temp[0]);
                String x = temp[1];
                arr[i][1] = Integer.parseInt(x);
            }
            Solution obj = new Solution();
            // The mergeOverlap function now returns a List<int[]>
            List<int[]> ans = obj.mergeOverlap(arr);

            // Printing the merged arr
            for (int[] interval : ans) {
                System.out.print(interval[0] + " " + interval[1] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        
        Arrays.sort(arr,(n1,n2)->Integer.compare(n1[0],n2[0]));
        // System.out.print(Arrays.deepToString(arr));
        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
          int sub[]=new int[2];
          sub[0]=arr[i][0];
          int max=arr[i][1];
          while(i<arr.length-1 && max>=arr[i+1][0])
          {
              if(arr[i+1][1]>max)
              max=arr[i+1][1];
              i++;
          }
          sub[1]=max;
          ans.add(sub);
        }
        return ans;
    }
}