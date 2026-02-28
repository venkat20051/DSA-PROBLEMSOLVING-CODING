class Solution {
    public int islandPerimeter(int[][] grid) {
        int count=0;
        int perimter=0;
        for(int i=0;i<grid.length;i++)
        {
            int inner=4;
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    if(j<grid[0].length-1 && grid[i][j+1]==1)
                    {
                        // System.out.println("right");
                    inner--;
                    }
                    if(i>0 && grid[i-1][j]==1)
                    {
                        // System.out.println("left");
                        inner--;
                    }
                    if(j>0 && grid[i][j-1]==1)
                    {
                        // System.out.println("up");
                    inner--;
                    }
                    if(i<grid.length-1 && grid[i+1][j]==1)
                    {
                        // System.out.println("down");
                    inner--;
                        // System.out.println("hi"+inner);
                    }
                    // System.out.println(inner);
                    perimter+=inner;
                }
                inner=4;
            }
        }
        return perimter;
    }
}