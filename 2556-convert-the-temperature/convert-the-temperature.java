class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans=new double[2];
        double k=celsius+273.15;
        double f=celsius*1.80+32.00;
        ans[0]=k;
        ans[1]=f;
        return ans;
    }
}