class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++)
        {
            int temp=i;
            int c=0;
            while(temp>0)
            {
                if((temp&1)>0)
                c++;
                temp=temp>>1;
            }
            arr[i]=c;
        }
        return arr;
    }
}