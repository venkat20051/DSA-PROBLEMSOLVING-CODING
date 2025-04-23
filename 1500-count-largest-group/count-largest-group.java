class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> sample=new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            int temp=i;
            int sum=0;
            while(temp>0)
            {
                int r=temp%10;
                sum+=r;
                temp=temp/10;
            }
            sample.put(sum,sample.getOrDefault(sum,0)+1);
        }
        int ans=0;
        int prev=0;
        ArrayList<Map.Entry<Integer , Integer >> list = new ArrayList<>(sample.entrySet());
        list.sort( (n1,n2) -> n2.getValue() - n1.getValue());
        for(Map.Entry<Integer,Integer> hm:list)
        {
            int len=hm.getValue();
            if(prev==0)
            prev=len;
            if(prev!=len)
            return ans;
            else
            ans++;
        }
        return ans;
    }
}