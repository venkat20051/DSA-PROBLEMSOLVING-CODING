class Solution {
    public int numSpecial(int[][] mat) {
      int count=0;
      int n=mat.length;
      int m=mat[0].length;
      for(int i=0;i<mat.length;i++)
      {
        for(int j=0;j<mat[i].length;j++)
        {
            if(mat[i][j]==1)
            {
                if(col(i,j,m,mat) && row(i,j,n,mat))
                {
                    count++;
                }
            }
        }
      }  
      return count;
    }
    public static boolean col(int column,int row,int n,int[][] mat)
    {
        for(int i=0;i<n;i++)
        {
            if(mat[column][i]==1)
            {
                if(i!=row)
                return false;            }
        }
        return true;
    }
     public static boolean row(int column,int row,int m,int[][] mat)
    {
        for(int i=0;i<m;i++)
        {
            if(mat[i][row]==1)
            {
                if(i!=column)
                return false;            }
        }
        return true;
    }
}