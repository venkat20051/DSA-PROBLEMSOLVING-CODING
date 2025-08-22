class Solution {
    public int minimumArea(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int up=n;
        int left=0;
        int bottom=m;
        int right=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    up=Math.min(up,i);
                    left=Math.max(left,i);
                    bottom=Math.min(bottom,j);
                    right=Math.max(right,j);
                }
            }
        }
        return (left - up+1)*(-bottom+right+1);
    }
}