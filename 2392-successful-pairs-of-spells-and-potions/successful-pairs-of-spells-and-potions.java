class Solution {
    public int[] successfulPairs(int[] s, int[] p, long su) {
        Arrays.sort(p);
        long ans;
        int[] res=new int[s.length];
        for(int i=0;i<s.length;i++)
        {
            int count=find((long)s[i],p,su);
            res[i]=count;
        }
        return res;
    }

    public static int find(long s,int[] p,long su)
    {
        int size=p.length;
        int low=0;
        int high=p.length-1;
        int count=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            long cur=(long)p[mid];
            if(cur*s<su)
            low=mid+1;
            else
            {
                high=mid-1;
                count=(size-high)-1;
            }
        }
        return count;
    }
}