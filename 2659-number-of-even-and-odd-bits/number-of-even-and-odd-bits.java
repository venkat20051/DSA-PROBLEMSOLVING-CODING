class Solution {
    public int[] evenOddBit(int n) {
        int even=0;
        int odd=0;
        int c=0;
        while(n>0)
        {
            if((n&1)>0 && c%2==0)
            {
                even++;
            }
            else if((n&1)>0 && c%2!=0)
            {
                odd++;
            }
            c++;
            n=n>>1;
        }
        int[] ans=new int[2];
        ans[0]=even;
        ans[1]=odd;
        return ans;
    }
}