class Solution {
    public int alternateDigitSum(int n) {
        int total=0;
        String st=Integer.toString(n);
        boolean pre=true;
        int i=0;
        int len=st.length();
        while(i<len)
        {
           int rem=Integer.parseInt(""+st.charAt(i));
           if(pre)
           total+=rem;
           else
           total-=rem;
           i++;
           pre=!pre;

        }
        return total;
    }
}