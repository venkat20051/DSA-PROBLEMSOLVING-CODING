//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

class Solution {
    static boolean isIntersect(int[][] intervals) {
        // Code Here
        Arrays.sort(intervals, (n1, n2) -> Integer.compare(n1[0], n2[0]));
        int n=intervals.length;
        for(int i=0;i<n-1;i++)
        {
            if(intervals[i][1]>=intervals[i+1][0])
            return true;
        }
        return false;
        //3 4 10 3 4 1 2
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[][] arr = new int[n][2];

            for (int i = 0; i < n; i++) {
                arr[i][0] = scanner.nextInt();
                arr[i][1] = scanner.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.isIntersect(arr);
            System.out.println(ans ? "true" : "false");
            System.out.println("~");
        }

        scanner.close();
    }
}
// } Driver Code Ends