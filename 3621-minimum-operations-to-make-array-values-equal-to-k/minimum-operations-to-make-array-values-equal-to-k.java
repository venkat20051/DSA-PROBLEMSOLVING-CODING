class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> sample=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<k)
            return -1;
            else if(nums[i]>k)
            sample.add(nums[i]);
        }
        return sample.size();
    }
}