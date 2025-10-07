class Solution {
    public static int find(ArrayList<Integer>zeores,int start,int end)
    {
        int low=0;
        int high=zeores.size()-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(zeores.get(mid)<start)
            {
            low=mid+1;
            }
            else
            {
            high=mid-1;
            ans=mid;
            }
        }
        return ans;
    }
    public int[] avoidFlood(int[] rains) {
        int[] ans=new int[rains.length];
        HashMap<Integer,Integer>sample=new HashMap<>();
        ArrayList<Integer>zeores=new ArrayList<>();
        for(int i=0;i<rains.length;i++)
        {
            if(rains[i]==0)
            zeores.add(i);
            else if(!sample.containsKey(rains[i]))
            {
            sample.put(rains[i],i);
            ans[i]=-1;
            }
            else
            {
                int start=sample.get(rains[i]);
                int end=i;
                int req=find(zeores,start,end);
                if(req==-1)
                return new int[0];
                ans[zeores.get(req)]=rains[i];
                sample.put(rains[i],i);
                zeores.remove(req);
                ans[i]=-1;
            }  
        }
        for(int i=0;i<zeores.size();i++)
        {
            ans[zeores.get(i)]=1;
        }
        return ans;
    }
}