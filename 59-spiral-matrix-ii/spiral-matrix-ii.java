class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        if(n==1)
        {
            res[0][0]=1;
        }
        else
        {
            int x=0,y=0,l1=0,l2=-1,c=0;
            int ans=1;
            while(ans<=n*n)
            {
                for(int i=0;i<n-y;i++)
                {
                    l2+=(c%2==0?1:-1);
                    res[l1][l2]=ans;
                    ans++;
                }
                x++;
                for(int i=0;i<n-x;i++)
                {
                    l1+=(c%2==0?1:-1);
                    res[l1][l2]=ans;
                    ans++;
                }
                y++;
                c++;
            }
        }
        return res;
    }
}