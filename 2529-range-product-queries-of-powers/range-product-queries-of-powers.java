class Solution {
    public int[] productQueries(int n, int[][] queries) {
        ArrayList<Integer> store=new ArrayList<>();
        String set=Integer.toString(n,2);
        int mod=1000000007;
        int[] bits=new int[32];
        bits[0]=1;
        for(int i=1;i<32;i++)
        {
            bits[i]=(bits[i-1]*2)%mod;
        }
        int strlen=set.length();
        int up=0;
        for(int i=strlen-1;i>=0;i--)
        {
            if(set.charAt(i)=='1')
            {
                store.add(bits[up]);
            }
            up++;
        }
        // System.out.println(store);
        
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int start=queries[i][0];
            int end=queries[i][1];
            long pro=1;
            for(int j=start;j<=end;j++)
            {
                pro=((pro%mod)*(store.get(j))%mod)%mod;
            }
            ans[i]=(int)pro%mod;
        }
        return ans;
    }
}