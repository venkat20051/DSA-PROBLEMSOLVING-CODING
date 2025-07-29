class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            max=(max|nums[i]);
        }
        int n=nums.length;
        int count=0;
        int total=(int)Math.pow(2,n);
        for(int i=1;i<total;i++)
        {
            int cur=0;
            for(int j=0;j<n;j++)
            {
                if((i & (1<<j) )!=  0)
                {
                    cur=cur|nums[j];
                }
            }
            if(cur==max)
            {
                count++;
            }
        }
        return count;
    }
}