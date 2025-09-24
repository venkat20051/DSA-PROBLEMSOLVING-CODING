class Solution {
    public String fractionToDecimal(int num, int den) {
        HashMap<Long,Integer> sample=new HashMap<>();
        StringBuilder ans=new StringBuilder();
        long n=num;
        long d=den;
        if(n==0) return "0";
        if(n>0 && d<0)
        {
            ans.append('-');
            d=d*-1;
        }
        if(n<0 && d>0)
        {
            ans.append('-');
            n=n*-1;
        }
        if(n<0 && d<0)
        {
            n=n*-1;
            d=d*-1;
        }
        if(n<d)
        ans.append(0);
        if(n>=d)
        {
            while(n>=d)
            {
                ans.append(""+n/d);
                n=n%d;
            }
        }
        if(n==0) return ans.toString();
        ans.append(".");
        n=n*10;
        // int ind=ans.length();
        int first=-1;
        while(n!=0)
        {
            long rem=n%d;
            if(sample.containsKey(n))
            {
                first=sample.get(n);
                break;
            }
            sample.put(n,ans.length());
            ans.append(""+n/d);
            n=n%d;
            if(n<d)
            n=n*10;
            // ind++;
        }
        // System.out.println(sample);
        if(n==0) return ans.toString();
        if(first!=-1)
        {
        ans.insert(first,"(");
        ans.append(")");
        }
        return ans.toString();

        
    }
}