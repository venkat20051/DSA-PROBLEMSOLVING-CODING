class Solution {
    public boolean canPartition(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++)
        {
            totalsum+=nums[i];
        }
        if(totalsum%2!=0)return false;
        int n=nums.length;
        int[][] dp=new int[n][(totalsum/2)+1];
        for(int[] i:dp)
        Arrays.fill(i,-1);
        return f(n-1,totalsum/2,nums,dp);
        // return dp[n-1][totalsum/2]==1;
    }
    boolean f(int n,int target,int[] nums,int[][] dp)
    {
        if(target==0)return true;
        if(n==0) if(target==nums[0])return true;
        if(n<0)return false;
        if(dp[n][target]!=-1) return dp[n][target]==1;

        boolean nottake=f(n-1,target,nums,dp);
        boolean take=false;
        if(nums[n]<=target)
        {
            take=f(n-1,target-nums[n],nums,dp);
        }
        dp[n][target]=(take | nottake)?1:0;
        return dp[n][target]==1;
        
        
    }
}