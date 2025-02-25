class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        PriorityQueue<Integer> ans=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<grid.length;i++)
        {
            PriorityQueue<Integer> sub=new PriorityQueue<>(Collections.reverseOrder());
            for(int j=0;j<grid[i].length;j++)
            {
                sub.add(grid[i][j]);
            }
            int temp=limits[i];
            while(temp>0)
            {
                Integer x=sub.poll();
                ans.add(x);
                temp--;
            }
            // System.out.println(ans);
        }
        long count=0;
        while(k-->0)
        {
            count+=(long)ans.poll();
        }
        return count;
    }
}