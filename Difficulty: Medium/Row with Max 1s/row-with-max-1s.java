class Solution {
    public int findMax1sRow(int[][] mat) {
        // code here
        int max=0;
        int index=0;
        for(int i=0;i<mat.length;i++)
        {
            int ones=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    ones++;
                }
            }
            if(ones>max)
            {
                max=ones;
                index=i;
            }
        }
        return index;
    }
}