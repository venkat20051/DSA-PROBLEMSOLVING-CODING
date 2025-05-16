class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=1 && nums[i]<=9)
            {
                sum+=nums[i];
            }
            else
            {
                int count=0;
                int temp=nums[i];
                int max=0;
                while(temp!=0)
                {
                    int rem=temp%10;
                    if(max<rem)
                    max=rem;
                    count++;
                    temp=temp/10;
                }
                StringBuilder str=new StringBuilder();
                for(int ind=0;ind<count;ind++)
                {
                    String st=Integer.toString(max);
                    str.append(st);
                }
                int ans1=Integer.parseInt(str.toString());
                sum+=ans1;
            }
        }
        return sum;
    }
}