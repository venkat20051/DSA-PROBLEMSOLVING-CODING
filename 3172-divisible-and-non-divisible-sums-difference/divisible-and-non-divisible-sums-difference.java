class Solution {
    public int differenceOfSums(int n, int m) {
        int total=0;
         int total2=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m!=0)
            total+=i;
            else
            total2+=i;
        }
       
        // for(int i=1;i<=n;i++)
        // {
        //     if(i%m==0)
        //     total2+=i;
        // }
        // System.out.println(total+" "+total2);
        return total-total2;
    }
}