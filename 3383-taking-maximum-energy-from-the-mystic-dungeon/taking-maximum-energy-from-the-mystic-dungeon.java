class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int res=Integer.MIN_VALUE;
        for(int i=energy.length-1;i>=0;i--)
        {
            if((i+k)<energy.length)
            {
                energy[i]+=energy[i+k];
            }
            res=Math.max(res,energy[i]);
        }
        return res;
    }
}