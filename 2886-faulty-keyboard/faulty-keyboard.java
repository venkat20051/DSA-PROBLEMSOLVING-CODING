class Solution {
    public String finalString(String s) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='i')
            {
                st.reverse();
            }
            else
            st.append(s.charAt(i));
        }
        return st.toString();
    }
}