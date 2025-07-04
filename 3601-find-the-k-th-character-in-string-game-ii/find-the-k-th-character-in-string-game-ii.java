class Solution {
    public static long getCount(long k,int[] operations,int ind,long len)
    {
        if(k==1||ind==0)
        return 0;
        long half=len/2;
        if(k<=half)
        return getCount(k,operations,ind-1,half);
        else
        return operations[ind-1]+getCount(k-half,operations,ind-1,half);
    }
    public char kthCharacter(long k, int[] operations) {
        long len=1;
        int ind=0;
        for(int i=1;i<=operations.length;i++)
        {
            len=len*2;
            if(len>=k)
            {
                ind=i;
                break;
            }
        }
        // System.out.println(len);
        long count=getCount(k,operations,ind,len);
        return (char)('a' + (count % 26));
    }
}
