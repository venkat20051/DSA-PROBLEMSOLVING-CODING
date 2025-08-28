class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int i=0;
        int j=0;
        while(i<n)
        {
            PriorityQueue<Integer> ans=new PriorityQueue<>(Collections.reverseOrder());
            int temp=i;
            // int tempj=j;
            while(j<m && temp<n)
            {
                // System.out.println(ans);
                // System.out.println(temp+" "+j);
                ans.add(grid[temp][j]);
                temp++;
                j++;
            }
            temp=i;
            j=0;
            while(j<m && temp<n)
            {
                grid[temp][j]=ans.poll();
                temp++;
                j++;
            }
            i++;
            j=0;
        }
        j=1;
        i=0;
        while(j<m)
        {
            PriorityQueue<Integer> ans=new PriorityQueue<>();
            int tempj=j;
            while(tempj<m && i<n)
            {
                ans.add(grid[i][tempj]);
                tempj++;
                i++;
            }
            tempj=j;
            i=0;
            while(tempj<m && i<n)
            {
                // System.out.println(temp+" "+j);
                grid[i][tempj]=ans.poll();
                i++;
                tempj++;
            }
            j++;
            i=0;
        }
        return grid;
    }
}