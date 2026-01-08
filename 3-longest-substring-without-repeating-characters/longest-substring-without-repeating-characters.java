class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> sample=new HashSet<>();
        int i=0;
        int j=0;
        int len=0;
        while(j<s.length())
        {
            if(sample.contains(s.charAt(j)))
            {
                while(s.charAt(i)!=s.charAt(j))
                {
                    sample.remove(s.charAt(i));
                    i++;
                }
                sample.remove(s.charAt(i));
                i++;
            }
            else
            {
                sample.add(s.charAt(j));
                j++;
            }
            len=Math.max(len,sample.size());
            
        }
        return len;
    }
}