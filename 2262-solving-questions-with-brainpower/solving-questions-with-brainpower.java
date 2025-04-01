class Solution {
    public long mostPoints(int[][] questions) {
        int n=questions.length;
        Long[] dp=new Long[n];
        return helping(questions,0,dp);
    }
    private long helping(int[][] questions ,int i,Long[] dp)
    {
        if(i>=questions.length)return 0;
        if(dp[i]!=null) return dp[i];
        dp[i]=Math.max(helping(questions,i+1,dp),questions[i][0]+helping(questions,i+questions[i][1]+1,dp));
        return dp[i];
    }
}