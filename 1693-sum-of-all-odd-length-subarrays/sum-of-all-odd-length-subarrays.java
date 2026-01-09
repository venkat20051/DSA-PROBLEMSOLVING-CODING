class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ArrayList<Integer> sample=new ArrayList<>();
            sample.add(arr[i]);
            ans+=arr[i];
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                sample.add(arr[j]);
                sum+=arr[j];
                if(sample.size()%2!=0)
                {
                    ans+=sum;
                }
            }
        }
        return ans;
    }
}