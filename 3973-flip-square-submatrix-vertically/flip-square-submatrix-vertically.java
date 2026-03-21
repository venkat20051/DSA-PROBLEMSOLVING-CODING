class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        // int ind=1;
        for(int i=y;i<y+k;i++)
        {
            // int end=(x+k)-ind;
            // System.out.println(end);
            int ind=x;
            for(int j=x+k-1;j>=x+(k/2);j--)
            {
                int temp=grid[j][i];
                grid[j][i]=grid[ind][i];
                grid[ind][i]=temp;
                // System.out.println(temp+" "+grid[end][j]+" "+grid[j][i]);
                ind++;
            }
            // ind++;
        }
        return grid;
    }
}