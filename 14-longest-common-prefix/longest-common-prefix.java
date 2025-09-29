class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        int c=0;
        for(int i=0;i<strs[0].length();i++)
        {
            c=0;
            for(int j=0;j<strs.length;j++)
            {
                if((i<strs[j].length()) && (strs[j].charAt(i)==strs[0].charAt(i)))
                {
                    c++;
                }
                else{
                    return s;
                }
            }
            if(c==strs.length)
            {
                s=s+strs[0].charAt(i);
            }
        }
        return s;
    }
}