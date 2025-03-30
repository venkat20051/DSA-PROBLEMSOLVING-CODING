class Solution {
    public int[] minCosts(int[] cost) {
        int ans[]=new int[cost.length];
        ans[0]=cost[0];
        int min=cost[0];
        for(int i=1;i<cost.length;i++)
        {
            if(cost[i]<min)
            min=cost[i];
            ans[i]=min;
        }
        return ans;
    }
}