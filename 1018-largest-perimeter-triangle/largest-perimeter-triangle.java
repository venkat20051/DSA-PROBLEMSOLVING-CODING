class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int pre=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int sum=nums[i]+nums[i+1];
            if(sum>nums[i+2])
            {
                pre=Math.max(pre,sum+nums[i+2]);
            }
        }
        return pre;
    }
}