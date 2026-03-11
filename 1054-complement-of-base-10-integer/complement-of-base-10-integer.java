class Solution {
    public int bitwiseComplement(int n) {
        int com=1;
        int ans=0;
        if(n==0)return 1;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans+=0;
                // System.out.println(n+" in 1");
               
            }
            else
            {
                ans=ans+com;
                // System.out.println(n+" in 2 "+com);
            }
            com=com*2;
           
            n=n>>1;
            
        }
        return ans;
    }
}