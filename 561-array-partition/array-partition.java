class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2)
        {
            int min=Math.min(nums[i],nums[i+1]);
            sum+=min;
        }
        return sum;
    }
}