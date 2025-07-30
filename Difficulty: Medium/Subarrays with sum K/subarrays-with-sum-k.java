class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> sample=new HashMap<>();
        sample.put(0,1);
        int count=0;
        int sum=0;
        for(int i:arr)
        {
            sum=sum+i;
            int required=sum-k;
            if(sample.get(required)!=null)
            {
                count=count+sample.get(required);
            }
            sample.put(sum,sample.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}