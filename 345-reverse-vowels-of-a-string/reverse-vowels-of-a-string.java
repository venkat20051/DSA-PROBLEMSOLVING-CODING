class Solution {
    public String reverseVowels(String s) {
        StringBuilder str=new StringBuilder(s);
        int i=0;
        int last=s.length()-1;
        String vow="aeiouAEIOU";
        while(i<last)
        {
            while(i<s.length() && !vow.contains(""+s.charAt(i)))
            i++;
            while(last>=0 && !vow.contains(""+s.charAt(last)))
            last--;
            if(i<s.length() && vow.contains(""+s.charAt(i)))
            {
            char f=s.charAt(i);
            char l=s.charAt(last);
            str.setCharAt(i,l);
            str.setCharAt(last,f);
            }
            i++;
            last--;
        }
        return str.toString();
    }
}