//{ Driver Code Starts
import java.io.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public List<Integer> findEvenOccurrences(int[] arr) {
        // code here
        LinkedHashMap<Integer,Integer> sample=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sample.put(arr[i],sample.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> hm:sample.entrySet())
        {
            int x=hm.getValue();
            if(x%2==0)
            ans.add(hm.getKey());
        }
        if(ans.size()==0)
        ans.add(-1);
        return ans;
    }
    
}



//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            int[] arr = new int[inputArray.length];
            for (int j = 0; j < inputArray.length; j++) {
                arr[j] = Integer.parseInt(inputArray[j]);
            }

            Solution solution = new Solution();
            List<Integer> result = solution.findEvenOccurrences(arr);
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends