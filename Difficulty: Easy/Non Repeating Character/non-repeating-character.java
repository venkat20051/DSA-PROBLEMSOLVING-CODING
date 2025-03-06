//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        char ans='$';
        LinkedHashMap<Character,Integer> sam=new LinkedHashMap<>();
        for(char i:s.toCharArray())
        {
            sam.put(i,sam.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Character,Integer>hm:sam.entrySet())
        {
            int c=hm.getValue();
            if(c==1)
            {
                ans=hm.getKey();
                break;
            }
        }
        return ans;
    }
}
