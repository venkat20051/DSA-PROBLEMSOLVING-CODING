class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer,ArrayList<Integer>> sample=new TreeMap<>();
        for(int num:arr){
            int count=0;
            int temp=num;
            while(temp>0)
            {
                if((temp&1)>0)
                count++;
                temp=temp>>1;
            }
            if(sample.containsKey(count))
            {
                ArrayList<Integer> str=sample.get(count);
                str.add(num);
                sample.put(count,str);
            }
            else
            {
                ArrayList<Integer> str=new ArrayList<>();
                str.add(num);
                sample.put(count,str);
            }
        }
        int[] ans=new int[arr.length];
        int st=0;
        for(Map.Entry<Integer,ArrayList<Integer>> hm:sample.entrySet())
        {
            ArrayList<Integer> sam=hm.getValue();
            Collections.sort(sam);
            for(Integer i:sam)
            {
                ans[st++]=i;
            }
        }
        return ans;
    }
}