class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> sam=new HashMap<>();
        int sum=0;
        int[] ans=new int[2];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(sam.containsKey(grid[i][j]))
                ans[0]=grid[i][j];
                else
                {
                sam.put(grid[i][j],1);
                sum=sum+grid[i][j];
                }
            }
        }
        int n=grid.length;
        // System.out.print(n);
        n=n*n;
        int total=(n*(n+1))/2;
        // System.out.print(total);
        ans[1]=total-sum;
        return ans;

    }
}