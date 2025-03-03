//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s = in.readLine();

            Solution ob = new Solution();
            out.println(ob.decodeString(s));

            out.println("~");
        }
        out.close();
    }
}
// } Driver Code Ends



class Solution {
    static String decodeString(String s) {
        // code here
       Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                // Build the full number (handles multi-digit numbers)
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push current number and string onto stacks, then reset
                numStack.push(num);
                strStack.push(currStr);
                num = 0;
                currStr = new StringBuilder();
            } else if (ch == ']') {
                // Pop and repeat the string
                StringBuilder temp = currStr;
                currStr = strStack.pop();
                int repeatTimes = numStack.pop();
                
                while (repeatTimes-- > 0) {
                    currStr.append(temp);
                }
            } else {
                currStr.append(ch);
            }
        }

        return currStr.toString();
    }
}