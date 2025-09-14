class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>cons=new HashMap<>();
        HashMap<Character,Integer>vow=new HashMap<>();
        String vowels="aeiou";
        for(int i=0;i<s.length();i++)
        {
            if(vowels.contains(""+s.charAt(i)))
            {
                vow.put(s.charAt(i),vow.getOrDefault(s.charAt(i),0)+1);
            }
            else
            {
                cons.put(s.charAt(i),cons.getOrDefault(s.charAt(i),0)+1);
            }
        }
        int maxcon=0;
        int maxvow=0;
        for(Map.Entry<Character,Integer>st:vow.entrySet())
        {
            if(st.getValue()>maxvow)
            maxvow=st.getValue();
        }
        for(Map.Entry<Character,Integer>st:cons.entrySet())
        {
            if(st.getValue()>maxcon)
            maxcon=st.getValue();
        }
        return maxvow+maxcon;
    }
}