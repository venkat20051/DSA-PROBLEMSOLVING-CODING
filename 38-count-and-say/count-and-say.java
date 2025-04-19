class Solution {
    public static StringBuilder getSay(StringBuilder sample)
    {
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<sample.length();i++)
        {
            String pres=""+sample.charAt(i);
            int count=1;
            for(int j=i+1;j<sample.length();j++)
            {
                if (sample.charAt(j) == pres.charAt(0))
                count++;
                else
                break;
            }
            ans.append(Integer.toString(count)).append(pres);
            i=i+count-1;
        }
        return ans;
    }
    public String countAndSay(int n) {
        
        if(n==1)
        return "1";
        StringBuilder sample=new StringBuilder("1");
        int k=1;
        while(k<n)
        {
            StringBuilder start=new StringBuilder(sample);
            sample.setLength(0);
            sample.append(getSay(start));
            // System.out.println(sample);
            k++;
        }
        return sample.toString();
    }
}