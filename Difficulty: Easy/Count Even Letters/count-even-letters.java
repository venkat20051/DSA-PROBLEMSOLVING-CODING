class Solution {
    public int count(String s) {
        // code here
        HashMap<Character,Integer> sample=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            sample.put(s.charAt(i),sample.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        for(Map.Entry<Character,Integer>hm:sample.entrySet())
        {
            if(hm.getValue()%2==0)
            count++;
        }
        return count;
    }
}