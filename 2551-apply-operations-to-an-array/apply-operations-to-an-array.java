class Solution {
    public int[] applyOperations(int[] nums) {
        Stack<Integer> sample=new Stack<>();
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            // System.out.println(nums[i]+"::"+nums[i+1]);
            if(nums[i]==0)
            continue;
                if(nums[i+1]==nums[i])
                {
                    int x=nums[i]*2;
                    sample.push(x);
                    nums[i+1]=0;
                    i++;
                }
                else
                {
                    sample.push(nums[i]);
                }
        }
        if(nums[n-1]==nums[n-2])
        {
            sample.push(nums[n-2]*2);
        }
        else
        {
            sample.push(nums[n-1]);
        }
        // System.out.println(sample);
        int[] ans=new int[n];
        Arrays.fill(ans,0);
        int ind=sample.size()-1;
        while(!sample.isEmpty())
        {
            ans[ind]=sample.pop();
            ind--;
        }
        return ans;
    }
}