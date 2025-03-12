class Solution {
    public int maximumCount(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int last_minus=0;
        int first_plus=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>0)
            {
                high=mid-1;
            }
            else if(nums[mid]<0)
            {
                if(mid==nums.length-1 || nums[mid+1]>=0)
                {
                    last_minus=mid;
                    break;
                }
                else{
                    low=mid+1;
                }

            }
            else if(nums[mid]==0)
            {
                high=mid-1;
            }
        }
        low=0;
        high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>0)
            {
                if(mid==0 || nums[mid-1]<=0)
                {
                first_plus=mid;
                break;
                }
                else{
                    high=mid-1;
                }
            }
            else if(nums[mid]<0)
            {
               low=mid+1;

            }
            else if(nums[mid]==0)
            {
                low=mid+1;
            }
        }
    //    System.out.print(first_plus+" "+last_minus);
       int puls_count=nums.length-first_plus;
       int neg_count=last_minus+1;
       if(last_minus==0 && nums[0]==0)
       neg_count=0;
       if(first_plus==nums.length-1 && nums[nums.length-1]==0)
       puls_count=0;
        return Math.max(puls_count,neg_count);
    }
}