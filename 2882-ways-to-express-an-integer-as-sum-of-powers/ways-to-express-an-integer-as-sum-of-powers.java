class Solution {
    public static int  mod=1000000007;
    public int numberOfWays(int n, int x) {
       List<Integer> sample=new ArrayList<>();
       int i=1;
    //    int mod=1000000007;
       while((int)Math.pow(i,x)<=n)
       {
        int x1=(int)Math.pow(i,x);
        sample.add(x1);
        i++;
       }
    //    System.out.println(sample);
    int sum=0;
    int[][] dp=new int[sample.size()][n+1];
    for(i=0;i<dp.length;i++)
    {
        Arrays.fill(dp[i],-1);
    }
       return Check(sample,0,sum,n,dp);
    }
    public int Check(List<Integer> sample,int start,int target,int req,int[][] dp)
    {
        if(target==req)return 1;
        if(target>req)return 0;
        if(start>=sample.size())return 0;

        if(dp[start][target]!=-1)
        return dp[start][target];

        dp[start][target]=Check(sample,start+1,target+sample.get(start),req,dp)%mod;
        dp[start][target]+=Check(sample,start+1,target,req,dp)%mod;

        return dp[start][target]%mod;

    }

}