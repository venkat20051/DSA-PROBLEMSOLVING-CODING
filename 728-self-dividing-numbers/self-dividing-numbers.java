class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int temp=i;
            boolean choose=true;
            while(temp!=0)
            {
                int rem=temp%10;
                if(rem==0 || i%rem!=0)
                {
                    choose=false;
                    break;
                }
                temp=temp/10;
            }
            if(choose)
            {
                ans.add(i);
            }

        }
        return ans;
    }
}