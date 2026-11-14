class Solution {
    public boolean isSubsequence(String s, String t) {
        StringBuilder str=new StringBuilder(s);
        StringBuilder target=new StringBuilder(t);
        int n=target.length();
        int strlen=str.length();
        int[][] dp=new int[n][strlen];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        if(str.length()==0)
        return true;
        if(s.length()>target.length())return false;
        // if(s.length()==1 || target.length()==1)
        // {
        //     if(s.charAt(0)==target.charAt(0))return true;
        //     else return false;
        // }
        boolean ans=f(n-1,strlen-1,target,str,dp);
        return dp[n-1][strlen-1]==1?true:false;
    }
    boolean f(int ind,int strlen,StringBuilder target , StringBuilder str,int[][]dp)
    {
    if(strlen<0)return true;
        if(ind<0)return false;
        if(dp[ind][strlen]!=-1)return dp[ind][strlen]==1;
        boolean nottake=f(ind -1,strlen,target,str,dp);
        boolean take=false;
        if(target.charAt(ind)==str.charAt(strlen))
        {
            take=f(ind-1,strlen-1,target,str,dp);
        }
         dp[ind][strlen] = (take || nottake) ? 1 : 0;

        return dp[ind][strlen] == 1;

    }
}