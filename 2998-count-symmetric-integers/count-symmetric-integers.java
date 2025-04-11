class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;
        for(int i=low;i<=high;i++)
        {
            int count=(int)Math.log10(i)+1;
            if((count%2)==0)
            {
                String str=Integer.toString(i);
                int start=0;
                int end=count-1;
                int sumleft=0;
                int sumright=0;
                while(start<end)
                {
                    sumright+=(str.charAt(start)-'0');
                    sumleft+=(str.charAt(end)-'0');
                    start++;
                    end--;
                }
                if(sumleft==sumright)
                ans++;
            }

        }
        return ans;
    }
}