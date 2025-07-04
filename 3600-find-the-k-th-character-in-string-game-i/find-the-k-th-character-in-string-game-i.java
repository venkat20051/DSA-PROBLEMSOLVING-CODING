class Solution {
    public static void generate(StringBuilder s)
    {
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='z')
            ans.append('a');
            else
            {
                int asci=(int)s.charAt(i)+1;
                ans.append((char)asci);
            }
        }
        s.append(ans.toString());
    }
    public char kthCharacter(int k) {
        StringBuilder s=new StringBuilder("a");
        for(int i=0;i<10;i++)
        {
           generate(s);
        }
        return s.charAt(k-1);
    }
}