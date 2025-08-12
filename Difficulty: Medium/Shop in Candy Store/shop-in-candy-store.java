class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Arrays.sort(prices);
        int i=0;
        int sum=0;
        int j=prices.length-1;
        while(i<=j)
        {
            sum+=prices[i];
            j-=k;
            i++;
        }
        res.add(sum);
        i=0;
        sum=0;
        j=prices.length-1;
        while(j>=i)
        {
            sum+=prices[j];
            i+=k;
            j--;
        }
        res.add(sum);
        return res;
    }
}
