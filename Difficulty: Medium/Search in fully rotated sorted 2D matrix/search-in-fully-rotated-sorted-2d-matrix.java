class Solution {
    public static boolean find(int[] mat,int x)
    {
        int low=0;
        int high=mat.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(mat[mid]==x)
            return true;
            else if(x>mat[mid])
            low=mid+1;
            else
            high=mid-1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        for(int i=0;i<mat.length;i++)
        {
            int low=0;
            int high=mat[i].length-1;
            int start=mat[i][low];
            int end=mat[i][high];
            if(start>end)
            {
                Arrays.sort(mat[i]);
                int sortstart=mat[i][low];
                int sortend=mat[i][high];
                if(x>=sortstart && x<=sortend)
                {
                    boolean temp=find(mat[i],x);
                    if(temp==true)
                    return true;
                    else
                    continue;
                }
                else
                continue;
            }
            else
            {
                if(x>=start && x<=end)
                {
                    boolean temp=find(mat[i],x);
                    if(temp==true)
                    return true;
                    else
                    continue;
                }
                else
                continue;
            }
        }
        return false;
    }
}