class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder str=new StringBuilder();
        int z=0;
        int one=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            z++;
            else
            one++;
        }
        str.append('1');
        one--;
        for(int i=0;i<z;i++)
        {
            str.insert(0,'0');
        }
        for(int i=0;i<one;i++)
        {
            str.insert(0,'1');
        }
        return str.toString();
    }
}