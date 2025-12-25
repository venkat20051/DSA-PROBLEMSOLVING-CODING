class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans=0;
        Arrays.sort(happiness);
        int rem=0;
        int len=happiness.length-1;
        while(k-->0)
        {
            if((happiness[len]-rem)>0)
            {
                ans+=happiness[len]-rem;
            }
            len--;
            rem++;
        }
        return ans;
    }
}