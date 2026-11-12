class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int inc=1;
        int dec=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i] && inc!=1)
            {
                inc++;
                max=Math.max(max,inc);
            }
            else if(nums[i-1]<nums[i] && inc==1)
            {
                inc++;
                dec=1;
                 max=Math.max(max,inc);
            }
            else if(nums[i-1]>nums[i] && dec!=1)
            {
                dec++;
                max=Math.max(max,dec);
            }
            else if(nums[i-1]>nums[i] && dec==1)
            {
                dec++;;
                inc=1;
                max=Math.max(max,dec);
            }
            else
            {
                inc=1;
                dec=1;
            }
        }
        return max;
    }
}