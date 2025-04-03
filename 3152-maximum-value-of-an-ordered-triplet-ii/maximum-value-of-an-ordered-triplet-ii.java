class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        int[] sufix=new int[n];
        prefix[0]=nums[0];
        int firstmax=nums[0];
        int lastmax=nums[n-1];
        sufix[n-1]=nums[n-1];
        for(int i=0;i<n;i++)
        {
            prefix[i]=Math.max(nums[i],firstmax);
            sufix[n-i-1]=Math.max(nums[n-i-1],lastmax);
            firstmax=Math.max(nums[i],firstmax);
            lastmax=Math.max(nums[n-i-1],lastmax);
        }
        // System.out.println(Arrays.toString(prefix)+"::"+Arrays.toString(sufix));
        long ans=Integer.MIN_VALUE;
        for(int i=1;i<n-1;i++)
        {
            ans=(long)Math.max(ans,(long)(prefix[i-1]-nums[i])*sufix[i+1]);
        }
        if(ans<0)
        return 0;
        return ans;
    }
}