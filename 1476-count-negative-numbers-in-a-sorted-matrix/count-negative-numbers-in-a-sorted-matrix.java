class Solution {
    public int countNegatives(int[][] grid) {
      int i=0;
      int j=0;
      int n=grid.length;
      int m=grid[0].length;
      int ans=0;
      while(i<n) 
      {
        j=0;
        while(j<m)
        {
            if(grid[i][j]<0)
            {
                ans+=(m-j);
                break;
            }
            j++;
        }
        i++;
        
      }
      return ans;
    }
}