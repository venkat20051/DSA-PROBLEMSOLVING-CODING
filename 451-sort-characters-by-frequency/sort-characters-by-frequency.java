class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> sample=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            sample.put(s.charAt(i),sample.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(sample.entrySet());
        // System.out.println(list);
        Collections.sort(list,(a,b)->b.getValue().compareTo(a.getValue()));
        StringBuilder str= new StringBuilder();
        for(Map.Entry<Character,Integer> hm:list)
        {
            int i=hm.getValue();
            while(i-->0)
            {
                str.append(hm.getKey());
            }
        }
        return str.toString();
    }
}