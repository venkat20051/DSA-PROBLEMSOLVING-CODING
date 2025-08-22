class Solution {
    public int median(int[][] mat) {
        // code here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<mat.length;i++)
        {
            min=Math.min(mat[i][0],min);
            max=Math.max(mat[i][mat[i].length-1],max);
        }
        // System.out.println(min+" "+max);
        int ele=(n*m)/2+1;
        while(min<max)
        {
            int mid=(min+max)/2;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                int low=0;
                int high=m;
                
                while(low<high)
                {
                    int mid2=(low+high)/2;
                    if(mat[i][mid2]<=mid)
                    {
                        low=mid2+1;
                    }
                    else
                    {
                        high=mid2;
                    }
                }
                sum+=low;
            }
            if(sum<ele)
            min=mid+1;
            else
            max=mid;
        }
        return min;
    }
}