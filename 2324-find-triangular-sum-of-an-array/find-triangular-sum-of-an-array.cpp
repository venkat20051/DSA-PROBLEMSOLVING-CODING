class Solution {
public:
    int triangularSum(vector<int>& nums) {
        while(nums.size()>1)
        {
            int n=nums.size();
            vector<int>k(n-1);
          for(int i=0;i<n-1;i++)
            {
                k[i]=((nums[i]+nums[i+1])%10);
            }
            nums=k;
        }
        if(nums.size()==1)
        {
        return nums[0];    
        }
        else
        {
            return 0;
        }  
    }
};