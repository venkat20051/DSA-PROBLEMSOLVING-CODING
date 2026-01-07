class Solution {
    public int[] shortestToChar(String s, char c) {
        int left=0;
        int right=-1;
        int start=0;
        int len=s.length();
        while(left<len && s.charAt(left)!=c)
        {
            left++;
        }
        int[] ans=new int[s.length()];

        for(int i=0;i<left;i++)
        {
            ans[i]=left-i;
        }
        ans[left]=0;
        right=left;
        start=left+1;
        
        while(start<len)
        {
            if(right<=start)
            {
                right=start;
                while(right<len && s.charAt(right)!=c)
                right++;
            }
            // System.out.println(left+" "+right+" "+start+" "+s.charAt(start));
            if(right==len)
            {
                ans[start]=start-left;
            }
            else
            ans[start]=Math.min(Math.abs(start-left),Math.abs(start-right));
            
            if(start==right)
            {
                ans[start]=0;
                // start++;
                left=start;
            }
            start++;
        }
        return ans;
    }
}