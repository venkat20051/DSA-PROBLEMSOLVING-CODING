class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> st=new HashMap<>();
        for(int i:nums)
        {
            st.put(i,st.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(st.entrySet());
        Collections.sort(list, (a, b) -> b.getValue().compareTo(a.getValue()));
        int[] ans=new int[k];
        int temp=0;
        for(Map.Entry<Integer,Integer> hm:list)
        {
            if(k==0)
            break;
            ans[temp]=hm.getKey();
            temp++;
            k--;
        }
        return ans;
    }
}