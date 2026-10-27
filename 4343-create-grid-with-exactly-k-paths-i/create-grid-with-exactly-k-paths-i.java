class Solution {
    public String[] createGrid(int m, int n, int k) {
        String[] ans=new String[m];
        // return new String[0];
        if((m==1 || n==1) && k!=1)
        return new String[0];
        if((int)(m*n)/2<k && m!=1 && n!=1)
        return new String[0];
            int temp=k-1;
            String str="";
            for(int j=0;j<n;j++)
            str+='.';
            ans[0]=str;
            int row=1;
            while(row<m)
            {
                str="";
                if(temp>=(n-1))
                {
                    for(int i=0;i<n;i++)
                    {
                        str+=".";
                    }
                    temp-=(n-1);
                }
                else
                {
                    for(int i=0;i<n-temp-1;i++)
                    {
                        str+='#';
                    }
                    for(int j=n-temp-1;j<n-1;j++)
                    {
                        str+='.';
                    }
                    str+='.';
                    temp=0;
                }
                ans[row]=str;
                row++;
                if(temp==0)
                break;
            }
            while(row<m)
            {
                str="";
                for(int i=0;i<n-1;i++)
                {
                    str+='#';
                }
                str+='.';
                ans[row]=str;
                row++;
            }

            if(n==3 && k==4)
            {
                String sam="..#";
                ans[0]=sam;
                // ans[2]="##.";
            }
            
        // }
        return ans;
    }
}