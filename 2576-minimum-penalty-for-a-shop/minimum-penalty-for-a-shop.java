class Solution {
    public int bestClosingTime(String customers) {
        int y_count=0;
        int n=customers.length();
        for(int i=0;i<n;i++)
        {
            if(customers.charAt(i)=='Y')
            y_count++;
        }
        int n_count=0;
        int ind=-1;
        int ans=Integer.MAX_VALUE;
        // System.out.println(y_count);
        for(int i=0;i<n;i++)
        {
            int lr=n_count+y_count;
            // System.out.println(lr+" "+ans);
            if(lr<ans)
            {
                ans=lr;
                ind=i;
            }
            if(customers.charAt(i)=='N')n_count++;
            if(customers.charAt(i)=='Y')y_count--;
        }
        // System.out.println(n_count+" "+y_count+" "+ans);
        if((n_count+y_count)<ans)
        {
            ind=n;
            ans=n_count+y_count;
        }
        return ind;
    }
}