class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=(double)nums[i];
        }
        // System.out.println(sum);
        double ans=(double)sum/k;
        int start=0;
        for(int i=k;i<nums.length;i++)
        {
            sum-=nums[start];
            sum+=nums[i];
                //  System.out.println(sum);
            ans=Math.max(ans,sum/k);
            start++;
        }
        return ans;
    }
}