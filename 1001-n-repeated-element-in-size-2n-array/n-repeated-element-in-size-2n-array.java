class Solution {
    public int repeatedNTimes(int[] nums) {
        int len=nums.length;
        int n=len/2;
        int i=0;
        int j=1;
        int ans=-1;
        Arrays.sort(nums);
        while(j<len)
        {
            if(nums[i]==nums[j])
            {
                j++;
            }
            else
            {
                int cur=j-i;
                if(cur==n)
                {
                    ans=nums[i];
                    break;
                }
                i=j;
                j++;
            }
        }
        if(nums[i]==nums[j-1])
        {
            int cur=j-i;
            if(cur==n)ans=nums[i];
        }
        return ans;
    }
}