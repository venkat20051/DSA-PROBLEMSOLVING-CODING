//{ Driver Code Starts
// Initial Template for Java
import java.util.Scanner;


// } Driver Code Ends
// User function Template for Java
class Solution {
    // Function to calculate the sum of squares of first 'number' natural numbers
    public int sumOfSquares(int number) {
        // code here
        return (number * (number + 1) * (2 * number + 1)) / 6;
    }
}

//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Solution ob = new Solution();

        while (t-- > 0) {
            int number = sc.nextInt();
            int ans = ob.sumOfSquares(number);
            System.out.println(ans);
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends