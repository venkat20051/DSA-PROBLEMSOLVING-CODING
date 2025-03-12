class Solution {
    public boolean hasAlternatingBits(int n) {
        int one=0;
        int zero=0;
        while(n>0)
        {
            if((n&1)>0)
            {
                if(one==0)
                {
                one++;
                if(zero>0)
                {
                    zero--;
                }
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(zero==0)
                {
                    zero++;
                    if(one>0)
                    {
                        one--;
                    }
                }
                else
                {
                    return false;
                }
            }
            n=n>>1;
        }
        return true;
        // if(c==1 || c==0)
        // return true;
        // else
        // return false;
    }
}