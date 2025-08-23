class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int pro=1;
        int max=Integer.MIN_VALUE;
        int n=nums.length-1;
        if(nums[0]<0 && nums[1]<0)
        {
            max=nums[0]*nums[1]*nums[n];
        }
        for(int i=n;i>=n-2;i--)
        {
            pro*=nums[i];
        }
        max=Math.max(max,pro);
        return max;
    }
}