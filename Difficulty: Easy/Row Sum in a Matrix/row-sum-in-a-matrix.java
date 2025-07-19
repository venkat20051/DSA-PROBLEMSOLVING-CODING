class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        int[] ans=new int[mat.length];
        for(int i=0;i<mat.length;i++)
        {
            int sum=0;
            for(int j=0;j<mat[i].length;j++)
            {
                sum+=mat[i][j];
            }
            ans[i]=sum;
        }
        return ans;
    }
}