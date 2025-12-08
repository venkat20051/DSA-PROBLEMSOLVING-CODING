class Solution {
    public int countTriples(int n) {
        int res=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                int x=i*i+j*j;
                int sq=(int)Math.sqrt(x);
                if(sq<=n && sq*sq==x)
                res+=2;
            }
        }
        return res;
    }
}