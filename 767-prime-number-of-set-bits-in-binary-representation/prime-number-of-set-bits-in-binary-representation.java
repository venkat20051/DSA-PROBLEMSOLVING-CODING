class Solution {
    public static boolean isPrime(int num)
    {
        if(num==2 || num==3)
        return true;
        else if(num<=1)
        return false;
        else if(num%2==0 || num%3==0)
        return false;
        else
        for(int i=5;i*i<=num;i+=6)
        {
            if(num%i==0 || num%(i+2)==0)
            return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            int c=0;
            int temp=i;
            while(temp>0)
            {
                if((temp&1)>0)
                {
                    c++;
                }
                temp=temp>>1;
            }
            if(isPrime(c))
            count++;
        }
        return  count;
    }
}