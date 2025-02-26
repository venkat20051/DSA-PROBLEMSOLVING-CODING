class Solution {
    public int numOfSubarrays(int[] arr) {
        int count=0;
        final int MOD = 1000000007;
        int[] prefix=new int[arr.length];
        int n=arr.length;
        // int[] sufix=new int[arr.length];
        // HashSet<Integer> s=new HashSet<>();
        // sufix[n-1]=arr[n-1];
        prefix[0]=arr[0];
        if(arr[0]%2!=0)
        count++;
        // s.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            prefix[i]=arr[i]+prefix[i-1];
            if(prefix[i]%2!=0)
            count=(count+1)%MOD;

        }
        // System.out.println(Arrays.toString(prefix));
        // System.out.println(Arrays.toString(sufix));
        // if(sufix[0]%2!=0)
        // count++;
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++)
        {
            if(prefix[i]%2!=0)
            {
                odd++;
                count=(count+even)%MOD;
            }  
            else
            {
                even++;
                count=(count+odd)%MOD;
            }       
        }
        return count % MOD;
    }
}