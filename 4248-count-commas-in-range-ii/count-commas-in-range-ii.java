class Solution {
    public long countCommas(long n) {
        if(n<=999) return 0;

        // long num=1000;
        long start1=1000;
        long total=0;
        long commas=1;
        while(start1<=n)
            {
                long end1=Math.min(n,start1*1000-1);
                long count=(end1-start1)+1;
                total+=count*commas;
                commas++;
                start1=start1*1000;
            }
        return total;
    }
}