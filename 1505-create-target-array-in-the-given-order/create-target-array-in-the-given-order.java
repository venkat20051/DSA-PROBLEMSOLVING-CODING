class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> sample=new ArrayList<>();
        for(int i=0;i<index.length;i++)
        {
            sample.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sample.get(i);
        }
        return nums;
    }
}