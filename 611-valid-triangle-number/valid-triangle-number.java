class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int k=nums.length-1;k>=2;k--)
        {
            int i=0;
            int j=k-1;
            // System.out.println(i+" "+j);
            while(i<j)
            {
                int sum=nums[i]+nums[j];
                // System.out.println(sum+" "+nums[k]);
                if(sum>nums[k])
                {
                count+=(j-i);
                // i++;
                j--;
                }
                else
                i++;
            }
        }
        return count;
    }
}