class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int num=1;
        int ind=0;
        for(int i=0;i<n/2;i++)
        {
            ans[ind]=num;
            ind++;
            ans[ind]=-(num);
            ind++;
            num++;
        }
        if(n%2!=0)
        ans[ind]=0;
        return ans;
    }
}