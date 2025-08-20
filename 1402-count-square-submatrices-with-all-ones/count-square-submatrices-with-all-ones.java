class Solution {
    public int countSquares(int[][] matrix) {
        int m=matrix.length;
        int ans=0;
        for(int i=0;i<matrix.length;i++)
        {

            for(int j=0;j<matrix[i].length;j++)
            {
                if(i==0||j==0)
                {
                    ans+=matrix[i][j];
                    continue;
                }
                else
                {
                    if(matrix[i][j]==1)
                    {
                    int up=matrix[i-1][j];
                    int upleft=matrix[i-1][j-1];
                    int downleft=matrix[i][j-1];
                    // int pres=matrix[i][j];
                    int min=Math.min(up,Math.min(upleft,downleft));
                    matrix[i][j]=min+1;
                    ans+=matrix[i][j];
                    }


                }
            }
        }
        return ans;
    }
}