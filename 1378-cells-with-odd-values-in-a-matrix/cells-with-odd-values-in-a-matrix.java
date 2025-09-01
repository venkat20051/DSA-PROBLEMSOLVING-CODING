class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans=new int[m][n];
        for(int i=0;i<indices.length;i++)
        {
            int row=indices[i][0];
            int col=indices[i][1];
            for(int j=0;j<n;j++)
            {
                ans[row][j]++;
            }
            for(int k=0;k<m;k++)
            {
                ans[k][col]++;
            }
        }
        int total=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ans[i][j]%2!=0)
                total++;
            }
        }
        return total;
    }
}