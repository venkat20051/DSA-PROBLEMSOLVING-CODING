class Spreadsheet {
    int[][] arr;

    public Spreadsheet(int rows) {
        arr=new int[rows+1][26];
        for(int[] ar:arr)
        Arrays.fill(ar,0);
    }
    
    public void setCell(String cell, int value) {
        char alpha;
        String num="";
        alpha=cell.charAt(0);
        for(int i=1;i<cell.length();i++)
        {
            num+=cell.charAt(i);
        }
        int col=(int)alpha-'A';
        int row=Integer.parseInt(num);
        arr[row][col]=value;
    }
    
    public void resetCell(String cell) {
        char alpha;
        String num="";
        alpha=cell.charAt(0);
        for(int i=1;i<cell.length();i++)
        {
            num+=cell.charAt(i);
        }
        int col=(int)alpha-'A';
        int row=Integer.parseInt(num);
        arr[row][col]=0;
    }
    
    public int getValue(String formula) {
        String cell1="";
        String cell2="";
        String digits="0123456789";
        int i;
        for(i=1;i<formula.length();i++)
        {
            if(formula.charAt(i)=='+')
            {
                break;
            }
            else
            {
                cell1+=formula.charAt(i);
            }
        }
        for(int j=i+1;j<formula.length();j++)
        {
            cell2+=formula.charAt(j);
        }
        // System.out.println(cell1+" "+cell2);
        int num1=0;
        int num2=0;
        if(!digits.contains(""+cell1.charAt(0)))
        {
        char alpha;
        String num="";
        alpha=cell1.charAt(0);
        for(i=1;i<cell1.length();i++)
        {
            num+=cell1.charAt(i);
        }
        int col=(int)alpha-'A';
        int row=Integer.parseInt(num);
        num1=arr[row][col];
        }
        else
        {
            num1=Integer.parseInt(cell1);
        }
        if(!digits.contains(""+cell2.charAt(0)))
        {
        char alpha;
        String num="";
        alpha=cell2.charAt(0);
        for(i=1;i<cell2.length();i++)
        {
            num+=cell2.charAt(i);
        }
        int col=(int)alpha-'A';
        int row=Integer.parseInt(num);
        // System.out.println(Arrays.deepToString(arr));
        // System.out.println(col+" "+row);
        num2=arr[row][col];
        }
        else
        {
            num2=Integer.parseInt(cell2);
        }
        // System.out.println("NUMs"+num1+" "+num2);
        return num1+num2;

    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */