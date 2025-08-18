class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        for(int i=1;i<s.length()-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i-1) && s.charAt(i)!=s.charAt(i+1) && s.charAt(i-1)!=s.charAt(i+1))
            c++;
        }
        return c;
    }
}