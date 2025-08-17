class Solution {
    public void rearrange(int[] arr, int x) {
        // code here
        TreeMap<Integer,ArrayList<Integer>> ans=new TreeMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int dif=Math.abs(arr[i]-x);
            if(ans.containsKey(dif))
            {
                ArrayList<Integer>sam=ans.get(dif);
                sam.add(arr[i]);
                ans.put(dif,sam);
            }
            else
            {
                ArrayList<Integer>sam=new ArrayList<>();
                sam.add(arr[i]);
                ans.put(dif,sam);
            }
        }
        int index=0;
        for(Map.Entry<Integer,ArrayList<Integer>> hm:ans.entrySet())
        {
            ArrayList<Integer> each=hm.getValue();
            for(int i=0;i<each.size();i++)
            {
                arr[index++]=each.get(i);
            }
        }
    }
}
