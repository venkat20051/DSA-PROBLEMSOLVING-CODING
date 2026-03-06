class Solution {
    public boolean checkOnesSegment(String s) {
        int count=0;
        int ans=0;
        if(s.length()==1)
        if(s.charAt(0)=='1')return true;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
            else
            {
                if(count>0)
                ans++;
                count=0;
            }
        }
        if(count>0)
        ans++;
        return ans==1?true:false;
    }
}