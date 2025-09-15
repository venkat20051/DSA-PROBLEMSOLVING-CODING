class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // char[] arr=brokenLetters.toCharArray();
        String[] str=text.split(" ");
        int count=0;
        for(int i=0;i<str.length;i++)
        {
            boolean flag=true;
            for(int j=0;j<str[i].length();j++)
            {
                if(brokenLetters.contains(""+str[i].charAt(j)))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            count++;
        }
        return count;
    }
}