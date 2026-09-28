class Solution {
    public int maxDepth(String s) {
        int maxium=0;
        int cur=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                cur++;
                maxium=Math.max(maxium,cur);
            }
            else if(s.charAt(i)==')')
            {
                cur--;
            }
        }
        return maxium;
    }
}