class Solution {
    public int findLHS(int[] nums) {
        TreeMap<Integer,Integer>sample=new TreeMap<>();
        for(int i:nums)
        {
            sample.put(i,sample.getOrDefault(i,0)+1);
        }
        int max=0;
        List<Map.Entry<Integer,Integer>>st=new ArrayList<>(sample.entrySet());
        // int cur=0;
        for(int i=0;i<st.size()-1;i++)
        {
            Map.Entry<Integer,Integer> first=st.get(i);
            Map.Entry<Integer,Integer> second=st.get(i+1);
            if(second.getKey()-first.getKey()==1)
            {
                int count=second.getValue()+first.getValue();
                if(count>max)
                max=count;
            }

        }
        return max;
    }
}