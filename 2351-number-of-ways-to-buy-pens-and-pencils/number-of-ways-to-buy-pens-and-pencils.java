class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long count=0;
        int t=0;
        int i=0;
        while(total>=(i*cost1))
        {
            t=total-(i*cost1);
            count+=(t/cost2)+1;
            i++;
        }
        return  count;
    }
}