class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[0];
        if(n==2)
        return Math.max(nums[0],nums[1]);
        int x=find(nums,0,n-2);
        int y=find(nums,1,n-1);
        // System.out.println(x+""+y);
        return Math.max(x,y);
    }
    static int find(int[] nums,int st,int ed)
    {
        int ans=nums[st];
        int ans2=Math.max(ans,nums[st+1]);
        for(int i=st+2;i<=ed;i++)
        {
            int newval=Math.max(ans+nums[i],ans2);
            int temp=ans2;
            ans2=newval;
            ans=temp;
        }
        return ans2;
    }
}