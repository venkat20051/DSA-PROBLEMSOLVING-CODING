class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitsum=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            int temp=nums[i];
            while(temp!=0){
                int rem=temp%10;
                digitsum+=rem;
                temp=temp/10;
            }
        }
        return Math.abs(sum-digitsum);
    }
}