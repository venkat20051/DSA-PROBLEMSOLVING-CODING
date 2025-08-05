class Solution {
    public int countHomogenous(String s) {
        int res=0;
        int j=0;
        int i=0;
        int n=s.length();
        int mod=1000000007;
        while(j<n)
        {
            int count=0;
            while( i<n && s.charAt(i)==s.charAt(j))
            {
                count++;
                i++;
            }
            j=i;
            res=( res +(int)((1L * count * (count+1)/2L)%mod))%mod;
            count=0;
        }
        return res;
    }
}