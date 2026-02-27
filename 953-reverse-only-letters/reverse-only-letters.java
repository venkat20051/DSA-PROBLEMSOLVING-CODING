class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder str=new StringBuilder(s);
        while(i<=j)
        {
            if(Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(j)))
            {
                Character temp=str.charAt(j);
                str.setCharAt(j,str.charAt(i));
                str.setCharAt(i,temp);
                i++;
                j--;
            }
            else
            {
                while(i<str.length() && !Character.isLetter(str.charAt(i)))
                i++;
                while(j>0 && !Character.isLetter(str.charAt(j)))
                j--;
            }
        }
        return str.toString();
    }
}