class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                pivot=i;
                break;
            }
        }
        if(pivot==-1)
        {
            int l=0;
            int r=nums.length-1;
            while(l<=r)
            {
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r--;
            }
            // for(int i=n-1;i>=0;i--)
            // {
            //     System.out.print(nums[i]+" ");
            // }
        }
        else
        {
            for(int i=nums.length-1;i>=pivot;i--)
            {
                if(nums[i]>nums[pivot])
                {
                    int temp=nums[i];
                    nums[i]=nums[pivot];
                    nums[pivot]=temp;
                    break;
                }
            }
            int l=pivot+1;
            int r=nums.length-1;
            while(l<=r)
            {
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r--;
            }
            // for(int i=0;i<n;i++)
            // System.out.print(nums[i]+" ");
        }
    }
}