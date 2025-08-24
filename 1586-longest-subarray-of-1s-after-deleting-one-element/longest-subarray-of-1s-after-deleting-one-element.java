class Solution {
    public int longestSubarray(int[] nums) {
        int zerocount=0;
        int ind=0;
        int j=0;
        int ans=0;
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]==0)
            {
                zerocount++;
                if(zerocount>=2)
                {
                    ans=Math.max(ans,i-j-1);
                    j=ind+1;
                    ind=i;
                    zerocount=1;

                }
                else
                ind=i;
            }
            i++;
          
        }
        ans=Math.max(ans,i-j-1);
        return ans;
    }
}