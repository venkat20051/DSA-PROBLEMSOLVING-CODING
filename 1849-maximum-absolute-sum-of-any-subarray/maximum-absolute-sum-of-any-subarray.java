class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int min_cur=0;
        int max_cur=0;
        for(int i=0;i<nums.length;i++)
        {
            max_cur+=nums[i];
            min_cur+=nums[i];
            if(min_cur>0)
            {
                min_cur=0;
            }
            if(max_cur<0)
            {
                max_cur=0;
            }
            min=Math.min(min,min_cur);
            max=Math.max(max,max_cur);
        }
        return Math.max(Math.abs(max-0),Math.abs(min-0));
    }
}