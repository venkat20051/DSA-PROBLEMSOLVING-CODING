class Solution {
    public ArrayList<Integer> findPeakGrid(int[][] mat) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        
        for(int i=0;i<n;i++)
        {
            int left=Integer.MIN_VALUE;
        int right=Integer.MIN_VALUE;
        int top=Integer.MIN_VALUE;
        int bottom=Integer.MIN_VALUE;
            for(int j=0;j<m;j++)
            {
                int cur=mat[i][j];
                if(i!=0)
                {
                    top=mat[i-1][j];
                }
                if(j!=m-1)
                {
                    right=mat[i][j+1];
                }
                if(j!=0)
                {
                    left=mat[i][j-1];
                }
                if(i!=n-1)
                {
                    bottom=mat[i+1][j];
                }
                if(cur>=top && cur>=bottom && cur>=left && cur>=right)
                {
                    ans.add(i);
                    ans.add(j);
                    return ans;
                }
            }
        }
        System.out.println(ans);
        return ans;
    }
}