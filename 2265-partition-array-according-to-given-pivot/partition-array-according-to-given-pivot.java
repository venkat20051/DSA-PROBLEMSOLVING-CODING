class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> Left=new ArrayList<>();
        int c=0;
        ArrayList<Integer> Rigth=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                Left.add(nums[i]);
            }
            else if(nums[i]>pivot)
            {
                Rigth.add(nums[i]);
            }
            else
            {
                c++;
            }
        }
        int[] ans=new int[nums.length];
        int ind=0;
        for(Integer i:Left)
        {
            ans[ind]=i;
            ind++;
        }
        for(int i=0;i<c;i++)
        {
            ans[ind]=pivot;
            ind++;
        }
        for(Integer i:Rigth)
        {
            ans[ind]=i;
            ind++;
        }
        return ans;
    }
}