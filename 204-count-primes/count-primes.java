class Solution {
    // public static boolean isPrime(int n)
    // {
    //     if(n==2||n==3)
    //     return true;
    //     else if(n%2==0 || n%3==0)
    //     return false;
    //     else
    //     {
    //         for(int i=5;i*i<=n;i+=6)
    //         {
    //             if(n%i==0||n%(i+2)==0)
    //             return false;
    //         }
    //         return true;
    //     }
        
    // }
    public int countPrimes(int n) {
        if(n<=1)
        {
            return 0;
        }
        int res=0;
        boolean[] arr=new boolean[n];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<n;i++)
        {
            if(arr[i])
            {
                for(int j=i*i;j<n;j+=i)
                {
                    arr[j]=false;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==true)
            res++;
        }
        return res;
    }
}