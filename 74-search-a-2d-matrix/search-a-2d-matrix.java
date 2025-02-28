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
            else if(mat[mid]>x)
            high=mid-1;
            else
            low=mid+1;
        }
        return false;
    } 
    public boolean searchMatrix(int[][] matrix, int target) {
       int low=0;
       int high=matrix.length-1;
       boolean ans=false;
       while(low<=high)
       {
        int mid=(low+high)/2;
        if(matrix[mid][0]<=target && matrix[mid][matrix[mid].length-1]>=target)
        {
            ans=find(matrix[mid],target);
            break;
        }
        else if(target<matrix[mid][0])
        high=mid-1;
        else
        low=mid+1;
       }
       return ans;
    }
}