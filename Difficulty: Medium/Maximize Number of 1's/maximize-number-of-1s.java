class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        TreeSet<Integer> zeroes=new TreeSet<>();
        int zerocount=0;
        int i=0;
        int j=0;
        int ans=0;
        int n=arr.length;
        while(j<n)
        {
            if(arr[j]==0)
            {
                zeroes.add(j);
                zerocount++;
                if(zerocount==k+1)
                {
                    ans=Math.max(ans,j-i);
                    i=zeroes.pollFirst()+1;
                    zerocount--;
                }
                
            }
            j++;
        }
        if(zerocount<=k+1)
        {
            ans=Math.max(ans,j-i);
        }
        return ans;
        
    }
}