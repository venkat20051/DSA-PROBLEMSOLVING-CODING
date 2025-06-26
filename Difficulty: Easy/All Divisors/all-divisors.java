class Solution {
    public ArrayList<Integer> printDivisors(int n) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(!ans.contains(i))
                ans.add(i);
                if(!ans.contains(n/i))
                ans.add(n/i);
            }
        }
        return ans;
    }
}