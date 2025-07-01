class Solution {
    public int substrCount(String s, int k) {
        // code here
        int count=0;
        Map<Character,Integer>sample=new HashMap<>();
        for(int i=0;i<k;i++)
        {
            sample.put(s.charAt(i),sample.getOrDefault(s.charAt(i),0)+1);
        }
        if(sample.size()==k-1)
        count++;
        for(int i=k;i<s.length();i++)
        {
            int x=sample.get(s.charAt(i-k));
            if(x==1)
            sample.remove(s.charAt(i-k));
            else
            sample.put(s.charAt(i-k),x-1);
            sample.put(s.charAt(i),sample.getOrDefault(s.charAt(i),0)+1);
            if(sample.size()==k-1)
            count++;
        }
        return count;
    }
}