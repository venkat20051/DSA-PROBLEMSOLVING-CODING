class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        return false;
        if(n==1)
        return true;
        double x=Math.log(n)/Math.log(4);
      return Math.abs(x - Math.round(x)) < 1e-10;
    }
}