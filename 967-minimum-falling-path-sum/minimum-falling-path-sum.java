class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        dp[0][0]=matrix[0][0];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0)dp[i][j]=matrix[i][j];
                else
                {
                    int up=Integer.MAX_VALUE;
                    int leftdig=Integer.MAX_VALUE;
                    int rightdig=Integer.MAX_VALUE;
                    if(i>0)up=matrix[i][j]+dp[i-1][j];
                    if(i>0 && j>0) leftdig=matrix[i][j]+dp[i-1][j-1];
                    if(i>0 && j<n-1) rightdig=matrix[i][j]+dp[i-1][j+1];
                    // System.out.println(up+" "+leftdig+" "+rightdig);
                    dp[i][j]=Math.min(up,Math.min(leftdig,rightdig));
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,dp[m-1][i]);
        }
        return min;
    }
}