class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        StringBuilder str=new StringBuilder(s);
        str=str.reverse();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                // System.out.println(s.charAt(i-1)+" "+str.charAt(j-1));
                if(s.charAt(i-1)==str.charAt(j-1))
                {
               dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
            // System.out.println("com");
        }
        // System.out.println(s+" "+str+" "+Arrays.deepToString(dp));
        return dp[n][n];
    }
}