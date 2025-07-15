class Solution {
    public boolean isValid(String word) {
        int num=0,cons=0,vow=0;
        String vowels="aeiouAEIOU";
        if(word.length()<3)
        return false;
        for(int i=0;i<word.length();i++)
        {
            if(vowels.contains(""+word.charAt(i)))
            {
                vow++;
            }
            else if(Character.isUpperCase(word.charAt(i))|| Character.isLowerCase(word.charAt(i)))
            {
                cons++;
            }
            else if(Character.isDigit(word.charAt(i)))
            {
                num++;
            }
            else
            return false;
        }
        if(vow>0 && cons>0)
        return true;
        else
        return false;

    }
}