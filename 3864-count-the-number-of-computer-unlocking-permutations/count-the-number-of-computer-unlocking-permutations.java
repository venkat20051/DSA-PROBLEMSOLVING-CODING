class Solution {
    int mod=1000000007;
    public int countPermutations(int[] complexity) {
        int count=0;
        for(int i=1;i<complexity.length;i++)
        {
            if(complexity[i]<=complexity[0])
            return 0;
        }
        return  (int)fact((long)complexity.length-1)%mod;
    }
    public long fact(long n)
    {
        if(n==0|| n==1)return 1%mod;
        return ((n%mod)*(fact(n-1)%mod))%mod;
    }
}