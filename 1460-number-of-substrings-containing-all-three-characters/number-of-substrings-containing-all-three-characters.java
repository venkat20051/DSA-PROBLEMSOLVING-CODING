class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        HashMap<Character,Integer> sample=new HashMap<>();
        int i=0;
        int n=s.length();
        int start=0;
        while(i<n)
        {
            sample.put(s.charAt(i),sample.getOrDefault(s.charAt(i),0)+1);
                while(sample.size()==3)
                {
                    char re=s.charAt(start);
                    int rec=sample.get(re);
                    if(rec==1)
                    sample.remove(re);
                    else
                    {
                        sample.put(re,rec-1);
                    }
                    count+=(n-i);
                  
                    start++;
                }
            i++;
        }
        return count;
    }
}