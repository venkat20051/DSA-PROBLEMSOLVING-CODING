class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++)
        {
            int fs=dp[i-1]+cost[i];
            int sc=dp[i-2]+cost[i];
            dp[i]=Math.min(fs,sc);
        }
        System.out.println(Arrays.toString(dp));
        return Math.min(dp[n-1],dp[n-2]);
    }
}