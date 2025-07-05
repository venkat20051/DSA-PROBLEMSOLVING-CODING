class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> sam=new HashMap<>();
        int ans=-1;
        for(int i=0;i<arr.length;i++)
        {
            sam.put(arr[i],sam.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> hm:sam.entrySet())
        {
            if(hm.getKey()==hm.getValue() && hm.getValue()>ans)
            ans=hm.getValue();
        }
        return ans;
    }
}