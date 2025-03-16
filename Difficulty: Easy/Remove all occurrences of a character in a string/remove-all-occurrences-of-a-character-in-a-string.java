//{ Driver Code Starts
// Initial Template for Java
import java.util.Scanner;


// } Driver Code Ends

// User function Template for Java
class Solution {
    // Function to remove all occurrences of the character from the string
    public void removeCharacter(StringBuilder s, char c) {
        // code here
        String str = s.toString().replaceAll(""+(c), "");
    s.setLength(0);
    s.append(str);
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        Solution sol = new Solution();

        while (t-- > 0) {
            String s = scanner.nextLine();         // Read the input string
            char c = scanner.nextLine().charAt(0); // Read the character to remove

            StringBuilder sb = new StringBuilder(s);
            sol.removeCharacter(sb, c); // Call the function to modify the string

            System.out.println(sb.toString()); // Output the modified string
            System.out.println("~");
        }

        scanner.close();
    }
}

// } Driver Code Ends