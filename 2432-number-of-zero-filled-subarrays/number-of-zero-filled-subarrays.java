class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count!=0 && nums[i]!=0)
            {
                long sam=(count*(count+1))/2;
                // System.out.println(sam);
                ans+=sam;
                count=0;
            }
            if(nums[i]==0)
            {
                count++;
            }

        }
        if(count!=0)
        {
             long sam=(count*(count+1))/2;
                // System.out.println(sam);
                ans+=sam;
        }
        return ans;
    }
}