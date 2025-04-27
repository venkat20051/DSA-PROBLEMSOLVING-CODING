class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<=nums.length-3;i++)
        {
            int sum=nums[i]+nums[i+2];
            int temp=nums[i+1]/2;
            if(nums[i+1]%2!=0)
            continue;
            if(sum==temp)
            count++;
            // System.out.println(sum+" "+(nums[i+1]/2));
        }
        return count;
    }
}