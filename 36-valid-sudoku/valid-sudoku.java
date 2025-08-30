class Solution {
    public boolean CheckBox(char[][] board,int col,int row,int val)
    {
        int a,b,c,d;
        if(col%3==0)
        {
            a=col;
            b=col+2;
        }
        else if(col%3==1)
        {
            a=col-1;
            b=col+1;
        }
        else
        {
            a=col-2;
            b=col;
        }
        if(row%3==0)
        {
            c=row;
            d=row+2;
        }
        else if(row%3==1)
        {
            c=row-1;
            d=row+1;
        }
        else
        {
            c=row-2;
            d=row;
        }  
        int count=0;
        for(int i=a;i<=b;i++)
        {
            for(int j=c;j<=d;j++)
            {
            if(( board[i][j] - '0')==val)
                {
                    count++;
                }
            }
        }
        // System.out.println("count"+" "+count);
        if(count>1)
        return false;
        else
        return true;

    }
    public boolean Checkrowcol(char[][] board,int col,int row,int val)
    {
        // System.out.println(val+" "+row+" "+col);
        int rowcount=0;
        int colcount=0;
        for(int i=0;i<9;i++)
        {
                if((board[i][row]-'0')==val)
                {
                    // System.out.println(board[i][col]+"col");
                    rowcount++;
                }
                if((board[col][i]-'0')==val)
                {
                    //  System.out.println(board[row][i]+"row");
                colcount++;
                }
        }
        // System.out.println(val+"="+"rowCount"+rowcount+"colcount"+colcount);
        if(rowcount>1 || colcount>1)
        {
            return false;
        }
        else
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]!='.')
                {
                boolean box=CheckBox(board,i,j,board[i][j]-'0');
                boolean rowcol=Checkrowcol(board,i,j,board[i][j]-'0');
                if((box && rowcol) ==false)
                return false;
                }
            }
        }
        return true;

    }
}