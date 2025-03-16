class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> sam=new HashSet<>();
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0 && !sam.contains(nums[i]))
            {
                System.out.println(nums[i]);
                sam.add(nums[i]);
                sum+=nums[i];
            }
        }
        if(sum==0)
        {
            int max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>max)
                {
                    max=nums[i];
                }
            }
            return max;
        }
        else
        return sum;
    }
}