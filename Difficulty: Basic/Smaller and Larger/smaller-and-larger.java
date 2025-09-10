// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int[] ans=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<target)
            {
                ans[0]++;
            }
            else if(arr[i]>target)
            {
                ans[1]++;
            }
            else
            {
                ans[0]++;
                ans[1]++;
            }
        }
        return ans;
        
        
    }
}