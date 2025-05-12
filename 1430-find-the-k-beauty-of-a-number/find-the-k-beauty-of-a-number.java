class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        int len=(int)Math.log10(num)+1;
        String sample=Integer.toString(num);
        StringBuilder str=new StringBuilder();
        for(int ind=0;ind<k;ind++)
        {
            str.append(sample.charAt(ind));
        }
        int x=Integer.parseInt(str.toString());
        if(num%x==0)
        {
            count++;
        }
        for(int i=k;i<sample.length();i++)
        {
            str.append(sample.charAt(i));
            str.deleteCharAt(0);
            int y=Integer.parseInt(str.toString());
        if(y!=0 && num%y==0)
        {
            count++;
        }
            
        }
        return count;
    }
}