class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> sample=new ArrayList<>();
        String first="qwertyuiop";
        String second="asdfghjkl";
        String third="zxcvbnm";
        for(int i=0;i<words.length;i++)
        {
            int f=0;
            int s=0;
            int t=0;
            for(int j=0;j<words[i].length();j++)
            {
              char pre = Character.toLowerCase(words[i].charAt(j));
                if(first.contains(""+pre))
                f++;
                else if(second.contains(""+pre))
                s++;
                else
                t++;
            }
            if(s==0 && t==0)
            sample.add(words[i]);
            else if(f==0 && t==0)
            sample.add(words[i]);
            else if(s==0 && f==0)
            sample.add(words[i]);
        }
        String[] ans=new String[sample.size()];
        for(int i=0;i<sample.size();i++)
        {
            ans[i]=sample.get(i);
        }
        return ans;
        
    }
}