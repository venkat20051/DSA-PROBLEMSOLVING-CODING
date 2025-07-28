class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer,Integer> sam=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sam.put(arr[i],sam.getOrDefault(arr[i],0)+1);
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer>hm:sam.entrySet())
        {
            ArrayList<Integer> sample=new ArrayList<>();
            sample.add(hm.getKey());
            sample.add(hm.getValue());
            ans.add(sample);
        }
        return ans;
    }
}