//{ Driver Code Starts
import java.util.Scanner;


// } Driver Code Ends

// User function Template for Java
class Solution {
    public String removeCharacter(String s, int pos) {
        // code here
        s=s.substring(0,pos)+s.substring(pos+1);
        return s;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution obj = new Solution();

        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            int pos = scanner.nextInt();

            String result = obj.removeCharacter(s, pos);
            System.out.println(result);
            System.out.println("~");
        }
        scanner.close();
    }
}
// } Driver Code Ends