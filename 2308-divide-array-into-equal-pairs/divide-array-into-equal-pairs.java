class Solution {
    public boolean divideArray(int[] nums) {
        int[] arr=new int[501];
        int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]^=1;
        }
        for(int i=0;i<501;i++)
        {
            if(arr[i]==1)
            return false;
        }
        return true;
    }
}