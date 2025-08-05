class Solution {
    public int numSub(String s) {
        int res=0;
        int i=0,j=0;
        int mod=1000000007;
        while(j<s.length())
        {
            int count=0;
            while(i<s.length() && s.charAt(i)=='1' && s.charAt(j)=='1')
            {
                count++;
                i++;
            }
            if(count==0)
            {
                i++;
                j++;
            }
            j=i;
            res=(res+(int)((1L*count*(count+1)/2L)%mod))%mod;
            count=0;
        }
        return res;
    }
}