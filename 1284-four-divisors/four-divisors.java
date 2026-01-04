class Solution {
    public int factor(int num)
    {
        int sum=0;
        int count=0;
        for(int i=1;i<=(int)Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                if(i!=num/i)
                {
                sum+=i;
                sum+=num/i;
                 count+=2;
                }
                else
                {
                    sum+=i;
                    count+=1;
                }
               
            }
            // System.out.println(num+" "+sum+" "+count);
            if(count>4)
            {
                return 0;
            }
        }
        if(count==4)
        return sum;
        else
        return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int cur=factor(nums[i]);
            if(cur!=0)
            {
                // System.out.println(nums[i]);
                ans+=cur;
            }
        }
        return ans;
    }
}