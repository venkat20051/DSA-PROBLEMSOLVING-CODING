class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max=-1;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
        int low=1;
        int high=max;
        int res=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            long count=0;
            for(int i=0;i<candies.length;i++)
            {
                if(candies[i]>=mid)
                count+=(long)candies[i]/mid;
            }
            if(count>=k)
            {
                low=mid+1;
                res=mid;
            }
            else
            {
                high=mid-1;
            }
        }
        return res;
    }

}