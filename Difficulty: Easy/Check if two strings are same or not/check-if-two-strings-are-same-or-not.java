//{ Driver Code Starts
// Initial Template for Java
import java.util.Scanner;


// } Driver Code Ends

// User function Template for Java
class StringUtils {
    // Function to check if two strings are the same
    public static boolean areStringsSame(String s1, String s2) {
        // code here
        return s1.equals(s2);
    }
}


//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine(); // To consume the remaining newline

        while (t-- > 0) {
            // Read two strings
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            // Check if the strings are the same using StringUtils class
            if (StringUtils.areStringsSame(s1, s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends