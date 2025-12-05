class Solution {
    public int countCollisions(String directions) {
        char prev=directions.charAt(0);
        int col=0;
        int len=directions.length();
        int i=0;
        int j=len-1;
        while(true && i<len)
        {
            if(directions.charAt(i)=='L')i++;
            else
            break;
        }
        while(true && j>=0)
        {
            if(directions.charAt(j)=='R')j--;
            else
            break;
        }
        for(int st=i;st<=j;st++)
        {
           if(directions.charAt(st)!='S')
           col++;
        }
        return col;
    }
}