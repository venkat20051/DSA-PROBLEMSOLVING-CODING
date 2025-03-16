class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low=1;
        long max_rank=ranks[0];
        for(int i=1;i<ranks.length;i++)
        {
            if(max_rank>ranks[i])
            max_rank=ranks[i];
        }
        long high=max_rank*cars*cars;
        long count=0;
        long res=0;
        while(low<=high)
        {
            long mid=(low+high)/2;
            count=0;
            for(int i=0;i<ranks.length;i++)
            {
                count+=(int)Math.sqrt(mid/ranks[i]);
            }
            if(count>=cars)
            {
                res=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        // System.out.println(high+" "+low+" "+count+" "+(low+high)/2);
        return res;

    }
}