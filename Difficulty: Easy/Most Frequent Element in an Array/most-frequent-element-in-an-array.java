//{ Driver Code Starts
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }
            Solution ob = new Solution();
            int ele = ob.mostFreqEle(arr);
            System.out.println(ele);
        }
    }
}
// } Driver Code Ends


class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        
        HashMap<Integer,Integer> sample=new HashMap<>();
        for(int i:arr)
        sample.put(i,sample.getOrDefault(i,0)+1);
        int ans=0;
        int count=0;
        for(Map.Entry<Integer,Integer> hm:sample.entrySet())
        {
            int key=hm.getKey();
            int value=hm.getValue();
            if(count<value)
            {
                count=value;
                ans=key;
            }
            else if(count==value)
            {
                if(ans<key){
                    ans=key;
                }
            }
        }
        return ans;
        
    }
}