class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> sam=new HashSet<>();
        int sum=0;
        int i=0;
        int j=0;
        int max=0;
        while(j<nums.length)
        {
            while(sam.contains(nums[j]) && i<j)
            {
                sam.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            sam.add(nums[j]);
            sum+=nums[j];
            if(sum>=max)
            max=sum;
            j++;
        }
        return max;
    }
}