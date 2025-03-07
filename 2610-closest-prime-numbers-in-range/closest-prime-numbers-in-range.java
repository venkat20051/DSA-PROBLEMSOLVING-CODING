class Solution {
    public static boolean isPrime(int i)
    {
        if(i<2)
        return false;
        if(i==2|| i==3)
        return true;
        if(i%2==0 || i%3==0)
        return false;
        for(int i1=5;i1*i1<=i;i1+=6)
        {
            if(i%i1==0 || i%(i1+2)==0)
            return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer>sam=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isPrime(i))
            sam.add(i);
        }
        int[] ans=new int[2];
        if(sam.size()<2)
        {
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        int min=Integer.MAX_VALUE;
        // System.out.print(sam);
        for(int i=1;i<sam.size();i++)
        {
            if((sam.get(i)-sam.get(i-1))<min)
            {
                min=sam.get(i)-sam.get(i-1);
                ans[0]=sam.get(i-1);
                ans[1]=sam.get(i);
            }
        }
        return ans;
    }
}