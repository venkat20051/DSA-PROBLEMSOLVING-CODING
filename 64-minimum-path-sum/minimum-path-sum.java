class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        // System.out.println(m+" "+n);
        if(m==1 || n==1)
        {
            int ans=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    ans+=grid[i][j];
                }
            }
            return ans;
        }
        int[][] dp=new int[m][n];
        for(int[] i:dp)
        Arrays.fill(i,-1);
        dp[0][0]=grid[0][0];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0) dp[i][j]=grid[i][j];
                else
                {
                    int up=Integer.MAX_VALUE;
                    int left=Integer.MAX_VALUE;
                    if(i>0)
                    up=grid[i][j]+dp[i-1][j];
                    if(j>0)
                    left=grid[i][j]+dp[i][j-1];
                    dp[i][j]=Math.min(up,left);
                }
            }
        }
        // int ans=path(m-1,n-1,grid,dp);

        return dp[m-1][n-1];
    }
    int path(int i,int j, int[][] grid,int[][] dp)
    {
        if(i==0 && j==0)
        {
            return grid[i][j];
        }
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=Integer.MAX_VALUE;
        int left=Integer.MAX_VALUE;
        if(i>0)
        up=grid[i][j]+path(i-1,j,grid,dp);
        if(j>0)
        left=grid[i][j]+path(i,j-1,grid,dp);
        return dp[i][j]= Math.min(up,left);
    }
}