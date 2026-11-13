class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int[][] dp=new int[m][m];
        // for(int[] i:dp)
        // Arrays.fill(i,-1);
        // int ans=path(0,0,triangle,dp);
        // return dp[0][0];

        for(int j=m-1;j>=0;j--)
        {
            dp[m-1][j]=triangle.get(m-1).get(j);
        }
        System.out.println(Arrays.deepToString(dp));
        for(int i=m-2;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                int down=triangle.get(i).get(j)+dp[i+1][j];
                int dig=triangle.get(i).get(j)+dp[i+1][j+1];
                dp[i][j]=Math.min(down,dig);
            }

        }
        return dp[0][0];
    }
    int path(int i,int j,List<List<Integer>> triangle,int[][] dp)
    {
        if(i==triangle.size()-1)
        {
            return triangle.get(triangle.size()-1).get(j);
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int down=triangle.get(i).get(j)+path(i+1,j,triangle,dp);
        int dig=triangle.get(i).get(j)+path(i+1,j+1,triangle,dp);
        return dp[i][j]=Math.min(down,dig);
    }
}