class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder temp=new StringBuilder("");
        int total=0;
        for(int i=0;i<num;i++)
        {
            temp.append('9');
            total+=9;
        }
        if(total<sum)
        return "";
        int index=1;
        int len=temp.length();
        while(total>0)
        {
            if(Math.abs(total-sum)<=9)
            {
                int t2=total-sum;
             temp.setCharAt(len - index, (char)(Math.abs(9-t2) + '0'));
                total=0;
            }
            else
            {
                total-=9;
                temp.setCharAt(len-index,'0');
                index++;
            }
        }
        return temp.toString();
    }
}