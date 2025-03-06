class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small=nums[0];
        int large=nums[nums.length-1];
        while(large!=0)
        {
            int temp=large;
            large=small%large;
            small=temp;
        }
        return small;
    }
}