//{ Driver Code Starts
// Initial Template for Java
import java.util.Scanner;


// } Driver Code Ends

// User function Template for Java
class Solution {
    // Function to search for a character in the string
    public int searchCharacter(String s, char ch) {
        // code here
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            return i;
        }
        return -1;
    }


//{ Driver Code Starts.

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    scanner.nextLine(); // To consume the newline character after integer input

    Solution sol = new Solution();

    while (t-- > 0) {
        String s = scanner.nextLine();          // Input the string
        char ch = scanner.nextLine().charAt(0); // Input the character to search

        int index = sol.searchCharacter(s, ch);
        System.out.println(index); // Output the index or -1 if not found
        System.out.println("~");
    }

    scanner.close();
}
}

// } Driver Code Ends