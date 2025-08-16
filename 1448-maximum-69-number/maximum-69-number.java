class Solution {
    public int maximum69Number (int num) {
        String st=Integer.toString(num);
        char[] str=st.toCharArray();
        for(int i=0;i<str.length;i++)
        {
            if(str[i]=='6')
            {
                str[i]='9';
                break;
            }
        }
        String sam=new String(str);
        return Integer.parseInt(sam);
    }
}