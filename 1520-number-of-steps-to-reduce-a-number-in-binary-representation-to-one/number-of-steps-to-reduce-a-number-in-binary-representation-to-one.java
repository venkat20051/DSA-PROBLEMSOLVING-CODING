class Solution {
    public int numSteps(String s) {
        ArrayList<Integer> sample=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            sample.add(0,(int)(s.charAt(i)-'0'));
        }
        int ans=0;
        while(sample.size()>1)
        {
            int first=sample.get(0);
            if(first==0)
            {
                sample.remove(0);
            }
            else
            {
                sample.set(0,0);
                int count=0;
                for(int j=1;j<sample.size();j++)
                {
                    if(sample.get(j)==0)
                    {
                        sample.set(j,1);
                        count++;
                        break;
                    }
                }
                if(count==0)
                {
                  for(int j=0;j<sample.size();j++)
                  {
                    sample.set(j,0);
                  }
                   sample.add(1); 
                }
            }
            ans++;
        }
        return ans;
    }
}