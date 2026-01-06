class Solution {
    public String largestEven(String s) {
        int len=s.length()-1;
        int count=0;
        while(len>=0)
        {
            if(s.charAt(len)=='1')
            len--;
            else
            break;
        }
        if(len<0)return "";
        else
        return s.substring(0,len+1);
    }
}