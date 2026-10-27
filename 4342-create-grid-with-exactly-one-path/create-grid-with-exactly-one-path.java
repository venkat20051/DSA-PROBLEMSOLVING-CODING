class Solution {
    public String[] createGrid(int m, int n) {
    String[] str=new String[m];
    for(int i=0;i<m;i++)
    {
        if(i==0)
        {
            String str1="";
            for(int j=0;j<n;j++)
            {
                str1+='.';
            }
            str[i]=str1;
        }
        else
        {
             String str1="";
            for(int j=0;j<n-1;j++)
            {
                str1+='#';
            }
            str1+='.';
            str[i]=str1;
        }
    }
    return str;
    }
}